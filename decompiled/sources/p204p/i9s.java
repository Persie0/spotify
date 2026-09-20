package p204p;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class i9s {

    /* JADX INFO: renamed from: a */
    public final String f100067a;

    /* JADX INFO: renamed from: b */
    public final Map f100068b;

    public i9s(String str, Map map) {
        this.f100067a = str;
        this.f100068b = map;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Media url must be set");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9s)) {
            return false;
        }
        i9s i9sVar = (i9s) obj;
        return wj50.m88271j(this.f100067a, i9sVar.f100067a) && wj50.m88271j(this.f100068b, i9sVar.f100068b);
    }

    public final int hashCode() {
        return this.f100068b.hashCode() + (this.f100067a.hashCode() * 31);
    }

    public /* synthetic */ i9s(String str) {
        this(str, nau.f152117a);
    }
}
