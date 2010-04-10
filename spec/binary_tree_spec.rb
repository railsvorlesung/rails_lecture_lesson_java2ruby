require 'rubygems'
gem 'rspec'

require File.dirname(__FILE__) + "/../lib/binary_tree"

describe BinaryTree do
  
  before(:each) do
    @numbers = [9, 5, 4, 23, 2, 11, 67, 33, 19, 45]
    @tree = BinaryTree.new(1)
    @numbers.each { |number| @tree.insert(number) }
  end
  
  it "should create a binary tree with 11 elements" do
    @tree.traverse.should eql("1 2 4 5 9 11 19 23 33 45 67 ")
  end
end