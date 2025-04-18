// Copyright 2023 Citra Emulator Project
// Licensed under GPLv2 or any later version
// Refer to the license.txt file included.

package io.github.mandarine3ds.mandarine.features.settings.model.view

class HeaderSetting(titleId: Int, descId: Int = 0) : SettingsItem(null, titleId, descId) {
    override val type = TYPE_HEADER
}
