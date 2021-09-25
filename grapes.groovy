@Grapes(
    @Grab(group='org.apache.commons', module='commons-lang3', version='3.4')
)

import org.apache.commons.lang3.text.WordUtils

String name = "Sadashiv Hanamant Badagi"
WordUtils wordutils = new WordUtils()

println WordUtils.initials(name)
