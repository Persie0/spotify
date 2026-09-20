package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public final class v6r {

    /* JADX INFO: renamed from: a */
    public final String f237935a;

    /* JADX INFO: renamed from: b */
    public final String f237936b;

    /* JADX INFO: renamed from: c */
    public final int f237937c;

    public v6r(String str, String str2, int i) {
        Bundle bundle = Bundle.EMPTY;
        this.f237935a = str;
        this.f237936b = str2;
        this.f237937c = i;
    }

    /* JADX INFO: renamed from: a */
    public final String m84814a() {
        return this.f237935a;
    }

    /* JADX INFO: renamed from: b */
    public final String m84815b() {
        return this.f237936b;
    }

    /* JADX INFO: renamed from: c */
    public final int m84816c() {
        return this.f237937c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6r)) {
            return false;
        }
        v6r v6rVar = (v6r) obj;
        if (!wj50.m88271j(this.f237935a, v6rVar.f237935a)) {
            return false;
        }
        Bundle bundle = Bundle.EMPTY;
        return wj50.m88271j(bundle, bundle) && this.f237936b.equals(v6rVar.f237936b) && this.f237937c == v6rVar.f237937c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f237937c) + s571.m77243b((Bundle.EMPTY.hashCode() + (this.f237935a.hashCode() * 31)) * 31, 31, this.f237936b);
    }
}
