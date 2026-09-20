package com.google.protobuf;

import java.io.IOException;
import java.util.Locale;
import p204p.s571;

/* JADX INFO: loaded from: classes.dex */
public class CodedOutputStream$OutOfSpaceException extends IOException {
    public CodedOutputStream$OutOfSpaceException() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public CodedOutputStream$OutOfSpaceException(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CodedOutputStream$OutOfSpaceException(int i, int i2, int i3, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbM77254m = s571.m77254m(i, "Pos: ", ", limit: ");
        sbM77254m.append(i2);
        sbM77254m.append(", len: ");
        sbM77254m.append(i3);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbM77254m.toString()), indexOutOfBoundsException);
    }
}
