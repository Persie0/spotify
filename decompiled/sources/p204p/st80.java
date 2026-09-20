package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class st80 implements Parcelable {
    public static final Parcelable.Creator<st80> CREATOR = new i980(19);

    /* JADX INFO: renamed from: a */
    public final PlaylistRequestDecorationPolicy f213840a;

    /* JADX INFO: renamed from: b */
    public final i490 f213841b;

    /* JADX INFO: renamed from: c */
    public final Set f213842c;

    /* JADX INFO: renamed from: d */
    public final boolean f213843d;

    /* JADX INFO: renamed from: e */
    public final rt80 f213844e;

    /* JADX INFO: renamed from: f */
    public final f5u0 f213845f;

    /* JADX INFO: renamed from: g */
    public final ot80 f213846g;

    /* JADX INFO: renamed from: h */
    public final int f213847h;

    /* JADX INFO: renamed from: i */
    public final List f213848i;

    public st80(PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy, i490 i490Var, Set set, boolean z, rt80 rt80Var, f5u0 f5u0Var, ot80 ot80Var, int i, List list) {
        this.f213840a = playlistRequestDecorationPolicy;
        this.f213841b = i490Var;
        this.f213842c = set;
        this.f213843d = z;
        this.f213844e = rt80Var;
        this.f213845f = f5u0Var;
        this.f213846g = ot80Var;
        this.f213847h = i;
        this.f213848i = list;
    }

    /* JADX INFO: renamed from: c */
    public static st80 m79236c(st80 st80Var, PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy, i490 i490Var, Set set, f5u0 f5u0Var, int i) {
        if ((i & 1) != 0) {
            playlistRequestDecorationPolicy = st80Var.f213840a;
        }
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy2 = playlistRequestDecorationPolicy;
        if ((i & 2) != 0) {
            i490Var = st80Var.f213841b;
        }
        i490 i490Var2 = i490Var;
        if ((i & 4) != 0) {
            set = st80Var.f213842c;
        }
        Set set2 = set;
        boolean z = (i & 8) != 0 ? st80Var.f213843d : false;
        rt80 rt80Var = st80Var.f213844e;
        if ((i & 32) != 0) {
            f5u0Var = st80Var.f213845f;
        }
        f5u0 f5u0Var2 = f5u0Var;
        ot80 ot80Var = st80Var.f213846g;
        int i2 = (i & 128) != 0 ? st80Var.f213847h : 0;
        List list = st80Var.f213848i;
        st80Var.getClass();
        return new st80(playlistRequestDecorationPolicy2, i490Var2, set2, z, rt80Var, f5u0Var2, ot80Var, i2, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st80)) {
            return false;
        }
        st80 st80Var = (st80) obj;
        return wj50.m88271j(this.f213840a, st80Var.f213840a) && wj50.m88271j(this.f213841b, st80Var.f213841b) && wj50.m88271j(this.f213842c, st80Var.f213842c) && this.f213843d == st80Var.f213843d && wj50.m88271j(this.f213844e, st80Var.f213844e) && wj50.m88271j(this.f213845f, st80Var.f213845f) && this.f213846g == st80Var.f213846g && this.f213847h == st80Var.f213847h && wj50.m88271j(this.f213848i, st80Var.f213848i);
    }

    public final int hashCode() {
        int iHashCode = this.f213840a.hashCode() * 31;
        i490 i490Var = this.f213841b;
        return this.f213848i.hashCode() + mt60.m62800g(this.f213847h, (this.f213846g.hashCode() + ((this.f213845f.hashCode() + ((this.f213844e.hashCode() + s571.m77245d(klh.m56830b((iHashCode + (i490Var == null ? 0 : i490Var.hashCode())) * 31, 31, this.f213842c), 31, this.f213843d)) * 31)) * 31)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        xud.m92157x(this.f213840a, parcel);
        parcel.writeParcelable(this.f213841b, i);
        Iterator itM64022o = nap.m64022o(this.f213842c, parcel);
        while (itM64022o.hasNext()) {
            parcel.writeParcelable((Parcelable) itM64022o.next(), i);
        }
        parcel.writeInt(this.f213843d ? 1 : 0);
        parcel.writeParcelable(this.f213844e, i);
        parcel.writeParcelable(this.f213845f, i);
        parcel.writeString(this.f213846g.name());
        parcel.writeInt(this.f213847h);
        parcel.writeStringList(this.f213848i);
    }

    public /* synthetic */ st80(PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy, i490 i490Var, Set set, boolean z, rt80 rt80Var, f5u0 f5u0Var, ot80 ot80Var, int i, List list, int i2) {
        this((i2 & 1) != 0 ? PlaylistRequestDecorationPolicy.m18420r() : playlistRequestDecorationPolicy, (i2 & 2) != 0 ? null : i490Var, (i2 & 4) != 0 ? gbu.f78413a : set, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? new qt80(s601.m77310m0(in80.f103923d, in80.f103926g)) : rt80Var, (i2 & 32) != 0 ? c5u0.f34291a : f5u0Var, (i2 & 64) != 0 ? ot80.f168997a : ot80Var, (i2 & 128) != 0 ? 100 : i, (i2 & 256) != 0 ? lau.f131415a : list);
    }
}
