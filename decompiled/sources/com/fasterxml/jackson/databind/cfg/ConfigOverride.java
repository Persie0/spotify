package com.fasterxml.jackson.databind.cfg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ConfigOverride {

    public static final class Empty extends ConfigOverride {
        static final Empty INSTANCE = new Empty();

        private Empty() {
        }
    }

    public static ConfigOverride empty() {
        return Empty.INSTANCE;
    }
}
