package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@rtz0(with = bv60.class)
public final class av60 {
    public static final zu60 Companion = new zu60();

    /* JADX INFO: renamed from: a */
    public final Map f20109a;

    public av60(Map map) {
        this.f20109a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof av60) && wj50.m88271j(this.f20109a, ((av60) obj).f20109a);
    }

    public final int hashCode() {
        return this.f20109a.hashCode();
    }
}
