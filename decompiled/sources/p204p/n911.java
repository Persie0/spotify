package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class n911 implements r911 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f151679a;

    public n911(ArrayList arrayList) {
        this.f151679a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n911) && this.f151679a.equals(((n911) obj).f151679a);
    }

    public final int hashCode() {
        return this.f151679a.hashCode();
    }
}
