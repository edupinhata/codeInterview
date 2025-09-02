
class orderItem:

    def __init__(self, name, price):
        self.dishName = name
        self.amount = 1
        self.price = price

    def __str__(self):
        return "{} | {:.2f}".format(self.dishName, self.price)