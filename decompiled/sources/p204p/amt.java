package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class amt implements omt {

    /* JADX INFO: renamed from: a */
    public final String f17199a;

    public amt(String str) {
        this.f17199a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof amt) && wj50.m88271j(this.f17199a, ((amt) obj).f17199a);
    }

    public final int hashCode() {
        return this.f17199a.hashCode();
    }
}
