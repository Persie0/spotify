package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class ic61 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f100747a;

    public ic61(ArrayList arrayList) {
        this.f100747a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ic61) && this.f100747a.equals(((ic61) obj).f100747a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (this.f100747a.hashCode() * 31);
    }
}
