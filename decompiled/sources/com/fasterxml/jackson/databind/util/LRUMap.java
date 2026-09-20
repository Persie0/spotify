package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class LRUMap<K, V> implements LookupCache<K, V>, Serializable {
    protected transient int _jdkSerializeMaxEntries;
    protected final transient ConcurrentHashMap<K, V> _map;
    protected final transient int _maxEntries;

    public LRUMap(int i, int i2) {
        this._map = new ConcurrentHashMap<>(i, 0.8f, 4);
        this._maxEntries = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this._jdkSerializeMaxEntries = objectInputStream.readInt();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this._jdkSerializeMaxEntries);
    }

    public Object readResolve() {
        int i = this._jdkSerializeMaxEntries;
        return new LRUMap(i, i);
    }
}
