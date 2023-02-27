package net.minecraftforge.gdi.tests.property

import groovy.transform.CompileStatic
import net.minecraftforge.gdi.annotations.DSLProperty
import org.gradle.api.provider.Property

@CompileStatic
interface PropertyOwner {
    @DSLProperty
    Property<String> getStringProperty()

    @DSLProperty
    Property<Boolean> getIsExisting()
}