package p204p;

import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.player.model.Context;
import com.spotify.playlist.policy.proto.ItemExtensionPolicy;
import com.spotify.playlist.policy.proto.PlaylistAlbumDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class lr9 {

    /* JADX INFO: renamed from: a */
    public final wt80 f136243a;

    /* JADX INFO: renamed from: b */
    public final yz80 f136244b;

    public lr9(wt80 wt80Var, yz80 yz80Var) {
        this.f136243a = wt80Var;
        this.f136244b = yz80Var;
    }

    /* JADX INFO: renamed from: a */
    public static ItemExtensionPolicy m59787a(hn80 hn80Var, ntx ntxVar) {
        vr50 vr50VarM18316q = ItemExtensionPolicy.m18316q();
        vr50VarM18316q.m86274r(hn80Var);
        vr50VarM18316q.m86272m(ntxVar);
        return (ItemExtensionPolicy) vr50VarM18316q.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public final Object m59788b(String str, ibk ibkVar) {
        kr9 kr9Var;
        lr9 lr9Var;
        aug1 tr9Var;
        List list;
        List list2;
        m340 m340Var;
        z240 z240VarM60640a;
        Integer numM29807r0;
        Integer numM29807r1;
        if (ibkVar instanceof kr9) {
            kr9Var = (kr9) ibkVar;
            int i = kr9Var.f125585c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kr9Var.f125585c = i - Integer.MIN_VALUE;
                lr9Var = this;
            } else {
                lr9Var = this;
                kr9Var = new kr9(lr9Var, ibkVar);
            }
        } else {
            lr9Var = this;
            kr9Var = new kr9(lr9Var, ibkVar);
        }
        Object objM76978s = kr9Var.f125583a;
        int i2 = kr9Var.f125585c;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(objM76978s);
            top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
            bjp0 bjp0Var = (bjp0) PlaylistDecorationPolicy.m18364g0().toBuilder();
            bjp0Var.m29523i0();
            bjp0Var.m29495G();
            top0VarM18421v.m81215w((PlaylistDecorationPolicy) bjp0Var.build());
            amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
            amp0VarM18396H.m26433D(true);
            top0VarM18421v.m81213u((PlaylistItemDecorationPolicy) amp0VarM18396H.build());
            ktp0 ktp0VarM18427E = PlaylistTrackDecorationPolicy.m18427E();
            ktp0VarM18427E.m57354v(true);
            ktp0VarM18427E.m57348m();
            ktp0VarM18427E.m57344B();
            ktp0VarM18427E.m57347E((TrackDecorationPolicy) TrackDecorationPolicy.newBuilder().setLink(true).setName(true).setPlayable(true).setIsExplicit(true).build());
            oep0 oep0VarM18329q = PlaylistAlbumDecorationPolicy.m18329q();
            oep0VarM18329q.m66800m(AlbumDecorationPolicy.newBuilder().setName(true).setCovers(true));
            ktp0VarM18427E.m57350r((PlaylistAlbumDecorationPolicy) oep0VarM18329q.build());
            ktp0VarM18427E.m57352t(ArtistDecorationPolicy.newBuilder().setName(true));
            top0VarM18421v.m81217y((PlaylistTrackDecorationPolicy) ktp0VarM18427E.build());
            amp0 amp0VarM18396H2 = PlaylistItemDecorationPolicy.m18396H();
            amp0VarM18396H2.m26433D(true);
            ntx ntxVar = ntx.IDENTITY_TRAIT;
            hn80 hn80Var = hn80.TRACK;
            ItemExtensionPolicy itemExtensionPolicyM59787a = m59787a(hn80Var, ntxVar);
            ntx ntxVar2 = ntx.VISUAL_IDENTITY_TRAIT;
            ItemExtensionPolicy itemExtensionPolicyM59787a2 = m59787a(hn80Var, ntxVar2);
            ItemExtensionPolicy itemExtensionPolicyM59787a3 = m59787a(hn80Var, ntx.CONSUMPTION_EXPERIENCE_TRAIT);
            hn80 hn80Var2 = hn80.ARTIST;
            amp0VarM18396H2.m26434m(hg40.m47411w(itemExtensionPolicyM59787a, itemExtensionPolicyM59787a2, itemExtensionPolicyM59787a3, m59787a(hn80Var2, ntxVar), m59787a(hn80Var2, ntxVar2)));
            top0VarM18421v.m81213u((PlaylistItemDecorationPolicy) amp0VarM18396H2.build());
            ez4 ez4Var = new ez4(lr9Var, edb.m38564m("spotify:list:managed-account-bans:", str), new st80((PlaylistRequestDecorationPolicy) top0VarM18421v.build(), null, null, false, pt80.f181071a, a5u0.f12598a, null, 0, null, 462), fbkVar, 28);
            kr9Var.f125585c = 1;
            objM76978s = s1h1.m76978s(15000L, ez4Var, kr9Var);
            yuk yukVar = yuk.f276404a;
            if (objM76978s == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76978s);
        }
        p2x0 p2x0Var = (p2x0) objM76978s;
        Map map = ((qu80) p2x0Var.m68971d()).f192599e.f271272q;
        boolean zM88271j = wj50.m88271j(map.get("is_explicit_allowed"), "true");
        String str2 = (String) map.get(Context.Metadata.KEY_TRACK_COUNT);
        int iIntValue = (str2 == null || (numM29807r1 = bm51.m29807r0(str2)) == null) ? 0 : numM29807r1.intValue();
        String str3 = (String) map.get("artist_count");
        int iIntValue2 = (str3 == null || (numM29807r0 = bm51.m29807r0(str3)) == null) ? 0 : numM29807r0.intValue();
        List<nw80> list3 = ((qu80) p2x0Var.m68971d()).f192598d;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list3, 10));
        for (nw80 nw80Var : list3) {
            dpx dpxVar = nw80Var.f159062p;
            String str4 = nw80Var.f159049c;
            v140 v140Var = (v140) dpxVar.mo30169a(v140.class);
            dpx dpxVar2 = nw80Var.f159062p;
            erc1 erc1Var = (erc1) dpxVar2.mo30169a(erc1.class);
            String str5 = (erc1Var == null || (m340Var = erc1Var.f62079a) == null || (z240VarM60640a = m340Var.m60640a(a340.f11860a)) == null) ? null : z240VarM60640a.f278475a.f198763a;
            boolean zM88271j2 = wj50.m88271j(nw80Var.f159053g.get("is_artist_banned"), "true");
            if (v140Var == null) {
                throw new IllegalArgumentException(edb.m38564m("IdentityTrait is required, but was not found for item: ", str4).toString());
            }
            Set set = dd41.f47702f;
            if (r46.m74726U(str4).f47709c == gn80.TRACK) {
                daj dajVar = (daj) dpxVar2.mo30169a(daj.class);
                boolean zContains = (dajVar == null || (list2 = dajVar.f47051b) == null) ? false : list2.contains(aaj.f13850b);
                boolean zContains2 = (dajVar == null || (list = dajVar.f47053d) == null) ? false : list.contains(baj.f25220c);
                String str6 = nw80Var.f159049c;
                String str7 = v140Var.f236243a;
                String strM43753y0 = g6f.m43753y0(v140Var.f236246d, ", ", null, null, iq9.f104700i, 30);
                t140 t140Var = (t140) g6f.m43745s0(v140Var.f236246d);
                tr9Var = new ur9(str6, str7, str5, t140Var != null ? t140Var.f216154b : null, strM43753y0, zContains, zContains2, zM88271j2);
            } else {
                tr9Var = new tr9(str4, v140Var.f236243a, str5);
            }
            arrayList.add(tr9Var);
        }
        return new vr9(zM88271j, iIntValue, iIntValue2, arrayList);
    }
}
