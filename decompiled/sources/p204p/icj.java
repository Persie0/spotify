package p204p;

import spotify.your_library.esperanto.proto.YourLibraryResponseHeader;

/* JADX INFO: loaded from: classes11.dex */
public final class icj {

    /* JADX INFO: renamed from: a */
    public final boolean f100827a;

    /* JADX INFO: renamed from: b */
    public final ibj f100828b;

    /* JADX INFO: renamed from: c */
    public final YourLibraryResponseHeader f100829c;

    public icj(boolean z, ibj ibjVar, YourLibraryResponseHeader yourLibraryResponseHeader) {
        this.f100827a = z;
        this.f100828b = ibjVar;
        this.f100829c = yourLibraryResponseHeader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icj)) {
            return false;
        }
        icj icjVar = (icj) obj;
        return this.f100827a == icjVar.f100827a && wj50.m88271j(this.f100828b, icjVar.f100828b) && wj50.m88271j(this.f100829c, icjVar.f100829c);
    }

    public final int hashCode() {
        return this.f100829c.hashCode() + ((this.f100828b.hashCode() + (Boolean.hashCode(this.f100827a) * 31)) * 31);
    }
}
