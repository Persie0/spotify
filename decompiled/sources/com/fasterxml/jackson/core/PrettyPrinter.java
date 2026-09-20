package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.p006io.SerializedString;
import com.fasterxml.jackson.core.util.Separators;

/* JADX INFO: loaded from: classes3.dex */
public interface PrettyPrinter {
    public static final Separators DEFAULT_SEPARATORS = Separators.createDefaultInstance();
    public static final SerializedString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(" ");
}
