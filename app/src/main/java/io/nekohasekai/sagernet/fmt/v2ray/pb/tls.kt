/******************************************************************************
 * Copyright (C) 2021 by nekohasekai <contact-git@sekai.icu>                  *
 *                                                                            *
 * This program is free software: you can redistribute it and/or modify       *
 * it under the terms of the GNU General Public License as published by       *
 * the Free Software Foundation, either version 3 of the License, or          *
 *  (at your option) any later version.                                       *
 *                                                                            *
 * This program is distributed in the hope that it will be useful,            *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of             *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the              *
 * GNU General Public License for more details.                               *
 *                                                                            *
 * You should have received a copy of the GNU General Public License          *
 * along with this program. If not, see <http://www.gnu.org/licenses/>.       *
 *                                                                            *
 ******************************************************************************/

package io.nekohasekai.sagernet.fmt.v2ray.pb

import com.v2ray.core.transport.internet.StreamConfigKt.Dsl
import com.v2ray.core.transport.internet.tls.Config
import com.v2ray.core.transport.internet.tls.ConfigKt
import com.v2ray.core.transport.internet.tls.config

val securityTypeTls = Config.getDescriptor().fullName

fun Dsl.tlsSettings(block: ConfigKt.Dsl.() -> Unit) {
    securitySettings.add(typedMessage { config(block) })
}