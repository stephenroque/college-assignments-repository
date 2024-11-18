def read_dict_file(filename):
    dict = {}
    fin = open(filename, "r")
    next(fin)
    for line in fin:
        if line.strip() == "}":
            break
        key, value = line.split(":")
        key = key.strip()
        value = value.strip()
        dict[key] = value
    return dict

def write_dict_file(filename, dict):
    fout = open(filename, "w")
    fout.write("{\n")
    for key, value in dict.items():
        fout.write("%s: %s\n" % (key, str(value).strip("[]").replace("'", '')))
    fout.write("}\n")

def invert_dict(dict):
    inverted_dict = {}
    for key, value in dict.items():
        values = value.split(",")
        for sub_value in values:
            sub_value = sub_value.strip()
            if sub_value in inverted_dict:
                inverted_dict[sub_value].append(key)
            else:
                inverted_dict[sub_value] = [key]
    return inverted_dict

def invert_dict_file(filename):
    input_dict = read_dict_file(filename)
    
    inverted_dict = invert_dict(input_dict)
    write_dict_file("inverted_dict.txt", inverted_dict)


if __name__ == '__main__':
    try:
        invert_dict_file('dict.txt')
    except FileNotFoundError:
        print("Sorry, the file you are looking for does not exist.")
    except:
        print('Sorry, something went wrong.')

