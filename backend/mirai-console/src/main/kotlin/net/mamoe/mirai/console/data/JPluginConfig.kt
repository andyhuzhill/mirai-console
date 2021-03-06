/*
 * Copyright 2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

package net.mamoe.mirai.console.data

/**
 * 一个插件的配置数据, 用于和用户交互.
 *
 * 用户可通过 mirai-console 前端 (如在 Android 中可视化实现) 修改这些配置, 修改会自动写入这个对象中.
 *
 * **提示**:
 * 插件内部的数据应用 [PluginData] 存储, 而不能使用 [PluginConfig].
 *
 * ### 实现
 *
 * 在 [JPluginData] 的示例基础上, 修改类定义
 * ```java
 * // 原
 * public class AccountPluginData extends JPluginData {
 * // 修改为
 * public class AccountPluginConfig extends JPluginConfig {
 * ```
 * 即可将一个 [PluginData] 变更为 [PluginConfig].
 *
 * @see JPluginData
 * @see PluginConfig
 */
public abstract class JPluginConfig(delegate: PluginData) : JPluginData(delegate), PluginConfig