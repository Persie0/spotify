package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.j */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0064j {
    /* JADX INFO: renamed from: a */
    public abstract C0065k mo744a(Object obj);

    /* JADX INFO: renamed from: b */
    public final boolean m745b(int i, C0058d c0058d, Object obj) throws InvalidProtocolBufferException {
        int i2 = c0058d.f911b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            c0058d.m665w(0);
            ((C0065k) obj).m748c(i3 << 3, Long.valueOf(c0058d.f910a.mo620n()));
            return true;
        }
        if (i4 == 1) {
            c0058d.m665w(1);
            ((C0065k) obj).m748c((i3 << 3) | 1, Long.valueOf(c0058d.f910a.mo617k()));
            return true;
        }
        if (i4 == 2) {
            ((C0065k) obj).m748c((i3 << 3) | 2, c0058d.m648f());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                int i5 = InvalidProtocolBufferException.f893b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            c0058d.m665w(5);
            ((C0065k) obj).m748c(5 | (i3 << 3), Integer.valueOf(c0058d.f910a.mo616j()));
            return true;
        }
        C0065k c0065k = new C0065k(0, new int[8], new Object[8], true);
        int i6 = i3 << 3;
        int i7 = i6 | 4;
        int i8 = i + 1;
        if (i8 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0058d.m644b() != Integer.MAX_VALUE && m745b(i8, c0058d, c0065k)) {
        }
        if (i7 != c0058d.f911b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (c0065k.f941e) {
            c0065k.f941e = false;
        }
        ((C0065k) obj).m748c(i6 | 3, c0065k);
        return true;
    }
}
