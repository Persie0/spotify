package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final class c630 {

    /* JADX INFO: renamed from: a */
    public final UUID f34357a;

    /* JADX INFO: renamed from: b */
    public final String f34358b;

    public c630(String str, UUID uuid) {
        this.f34357a = uuid;
        this.f34358b = str;
    }

    /* JADX INFO: renamed from: a */
    public final UUID m31503a() {
        return this.f34357a;
    }

    /* JADX INFO: renamed from: b */
    public final String m31504b() {
        return this.f34358b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c630)) {
            return false;
        }
        c630 c630Var = (c630) obj;
        return wj50.m88271j(this.f34357a, c630Var.f34357a) && wj50.m88271j(this.f34358b, c630Var.f34358b);
    }

    public final int hashCode() {
        return this.f34358b.hashCode() + (this.f34357a.hashCode() * 31);
    }
}
