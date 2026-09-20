package p204p;

import java.io.Serializable;

/* JADX INFO: renamed from: p.id */
/* JADX INFO: loaded from: classes.dex */
public final class C1975id implements Serializable {

    /* JADX INFO: renamed from: a */
    public final String f100905a;

    /* JADX INFO: renamed from: b */
    public final String f100906b;

    public C1975id(String str, String str2) {
        this.f100905a = str2;
        this.f100906b = n0b1.m63385y(str) ? null : str;
    }

    private final Object writeReplace() {
        return new C1933hd(this.f100905a);
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj instanceof C1975id) {
            C1975id c1975id = (C1975id) obj;
            String str = c1975id.f100906b;
            String str2 = this.f100906b;
            if (str == null) {
                zEquals = str2 == null;
            } else {
                zEquals = str.equals(str2);
            }
            if (zEquals && c1975id.f100905a.equals(this.f100905a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f100906b;
        return (str != null ? str.hashCode() : 0) ^ this.f100905a.hashCode();
    }
}
