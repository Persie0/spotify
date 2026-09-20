package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import p204p.AbstractC2155n8;
import p204p.u110;

/* JADX INFO: loaded from: classes2.dex */
public class InvalidProtocolBufferException extends IOException {

    /* JADX INFO: renamed from: a */
    public AbstractC2155n8 f10912a;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f10912a = null;
    }

    /* JADX INFO: renamed from: b */
    public static InvalidProtocolBufferException m24218b() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: a */
    public final void m24219a(u110 u110Var) {
        this.f10912a = u110Var;
    }
}
