import unittest
import function


class Testfunc(unittest.TestCase):

    def test_odd(self):
        self.assertEqual(function.odd(5), True)

    def test_even(self):
        self.assertEqual(function.even(4), True)

    def test_add(self):
        self.assertEqual(function.add(5, 5), 10)
        self.assertEqual(function.add(-1, 1), 0)
        self.assertEqual(function.add(-2, -2), -4)

    def test_subtract(self):
        self.assertEqual(function.subtract(15, 5), 10)
        self.assertEqual(function.subtract(-1, 1), -2)
        self.assertEqual(function.subtract(-2, -2), 0)
        self.assertEqual(function.subtract(-1, -3), 2)

    def test_maximum(self):
        self.assertEqual(function.maximum(15, 10), 15)

    def test_multiply(self):
        self.assertEqual(function.multiply(2, 5), 10)
        self.assertEqual(function.multiply(-1, 1), -1)
        self.assertEqual(function.multiply(-3, -3), 9)

    def test_divide(self):
        self.assertEqual(function.divide(10, 5), 2)
        self.assertEqual(function.divide(-1, 1), -1)
        self.assertEqual(function.divide(-2, -2), 1)
        self.assertEqual(function.divide(5, 2), 2.5)
        self.assertEqual(function.divide(-5, 2), -2.5)

        with self.assertRaises(ValueError):
            function.divide(10, 0)

    def test_prime(self):
        self.assertEqual(function.prime(5), True)


if __name__ == '__main__':
    unittest.main()
