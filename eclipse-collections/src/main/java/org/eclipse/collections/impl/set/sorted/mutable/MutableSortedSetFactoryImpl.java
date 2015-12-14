/*
 * Copyright (c) 2015 Goldman Sachs.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompany this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */

package org.eclipse.collections.impl.set.sorted.mutable;

import java.util.Comparator;

import net.jcip.annotations.Immutable;
import org.eclipse.collections.api.factory.set.sorted.MutableSortedSetFactory;
import org.eclipse.collections.api.set.sorted.MutableSortedSet;

@Immutable
public final class MutableSortedSetFactoryImpl implements MutableSortedSetFactory
{
    public <T> MutableSortedSet<T> empty()
    {
        return TreeSortedSet.newSet();
    }

    public <T> MutableSortedSet<T> of()
    {
        return this.empty();
    }

    public <T> MutableSortedSet<T> with()
    {
        return this.empty();
    }

    public <T> MutableSortedSet<T> of(T... items)
    {
        return this.with(items);
    }

    public <T> MutableSortedSet<T> with(T... items)
    {
        return TreeSortedSet.newSetWith(items);
    }

    public <T> MutableSortedSet<T> ofAll(Iterable<? extends T> items)
    {
        return this.withAll(items);
    }

    public <T> MutableSortedSet<T> withAll(Iterable<? extends T> items)
    {
        return TreeSortedSet.newSet(items);
    }

    public <T> MutableSortedSet<T> of(Comparator<? super T> comparator)
    {
        return this.with(comparator);
    }

    public <T> MutableSortedSet<T> with(Comparator<? super T> comparator)
    {
        return TreeSortedSet.newSet(comparator);
    }

    public <T> MutableSortedSet<T> of(Comparator<? super T> comparator, T... items)
    {
        return this.with(comparator, items);
    }

    public <T> MutableSortedSet<T> with(Comparator<? super T> comparator, T... items)
    {
        return TreeSortedSet.newSetWith(comparator, items);
    }

    public <T> MutableSortedSet<T> ofAll(Comparator<? super T> comparator, Iterable<? extends T> items)
    {
        return this.withAll(comparator, items);
    }

    public <T> MutableSortedSet<T> withAll(Comparator<? super T> comparator, Iterable<? extends T> items)
    {
        return TreeSortedSet.newSet(comparator, items);
    }
}