package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class s6x0 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f206218a;

    public /* synthetic */ s6x0(Object obj) {
        this.f206218a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static final Throwable m77348a(Object obj) {
        if (obj instanceof c6x0) {
            return ((c6x0) obj).f34640a;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static int m77349b(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s6x0) {
            return wj50.m88271j(this.f206218a, ((s6x0) obj).f206218a);
        }
        return false;
    }

    public final int hashCode() {
        return m77349b(this.f206218a);
    }

    public final String toString() {
        Object obj = this.f206218a;
        if (obj instanceof c6x0) {
            return ((c6x0) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
