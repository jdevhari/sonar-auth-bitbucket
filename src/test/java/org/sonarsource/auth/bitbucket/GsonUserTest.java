/*
 * Bitbucket Authentication for SonarQube
 * Copyright (C) 2016-2016 SonarSource SA
 * mailto:contact AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonarsource.auth.bitbucket;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GsonUserTest {

  @Test
  public void test_getter_and_setter() throws Exception {
    GsonUser underTest = new GsonUser()
      .setUsername("john")
      .setDisplayName("John");

    assertThat(underTest.getUsername()).isEqualTo("john");
    assertThat(underTest.getDisplayName()).isEqualTo("John");
  }

  @Test
  public void parse_from_json() throws Exception {
    GsonUser underTest = GsonUser.parse("{username:john, display_name:John}");

    assertThat(underTest.getUsername()).isEqualTo("john");
    assertThat(underTest.getDisplayName()).isEqualTo("John");
  }

}
