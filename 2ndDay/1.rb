skills = Array.new()
max = nil
index = 0
for i in 0..3
    skills.append(gets.split(" ").map(&:to_i))
    for j in 0..2
      if max == nil
        max = skills[i][j]
        index = i + 1
      elsif skills[i][j] > max
        max = skills[i][j]
        index = i + 1
      end
    end
end
puts index