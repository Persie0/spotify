package p204p;

import com.spotify.adsdisplay.embeddedad.events.proto.EmbeddedNPVAdEvent;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u4u implements l201 {

    /* JADX INFO: renamed from: a */
    public final qre0 f226799a;

    /* JADX INFO: renamed from: b */
    public final fiz f226800b;

    /* JADX INFO: renamed from: c */
    public final xre f226801c;

    /* JADX INFO: renamed from: d */
    public ContextTrack f226802d;

    /* JADX INFO: renamed from: e */
    public final c9k f226803e;

    public u4u(qre0 qre0Var, fiz fizVar, xre xreVar, luk lukVar) {
        this.f226799a = qre0Var;
        this.f226800b = fizVar;
        this.f226801c = xreVar;
        this.f226803e = edb.m38577z(lukVar);
    }

    /* JADX INFO: renamed from: b */
    public static void m82365b(u4u u4uVar, int i, ro0 ro0Var, Map map, String str, int i2) {
        String strMo29280c;
        String strMo29283j;
        String strM38000d0;
        String strUri;
        if ((i2 & 4) != 0) {
            map = nau.f152117a;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        u4uVar.getClass();
        k6u k6uVarM2814u = EmbeddedNPVAdEvent.m2814u();
        ContextTrack contextTrack = u4uVar.f226802d;
        if (contextTrack != null && (strUri = contextTrack.uri()) != null) {
            k6uVarM2814u.m55621v(strUri);
        }
        if (contextTrack != null && (strM38000d0 = e72.m38000d0(contextTrack, ContextTrack.Metadata.KEY_CONTEXT_URI)) != null) {
            k6uVarM2814u.m55617r(strM38000d0);
        }
        if (ro0Var == null || (strMo29280c = ro0Var.mo29280c()) == null) {
            strMo29280c = "";
        }
        k6uVarM2814u.m55615m(strMo29280c);
        if (ro0Var != null && (strMo29283j = ro0Var.mo29283j()) != null) {
            str = strMo29283j;
        } else if (str == null) {
            str = "";
        }
        k6uVarM2814u.m55616q(str);
        k6uVarM2814u.m55619t(yds.m93482l(i));
        ((wy3) u4uVar.f226801c).getClass();
        k6uVarM2814u.m55620u(System.currentTimeMillis());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            CharSequence charSequence = (CharSequence) entry.getKey();
            CharSequence charSequence2 = (CharSequence) entry.getValue();
            pqm0 pqm0Var = charSequence2 == null ? null : new pqm0(charSequence, charSequence2);
            if (pqm0Var != null) {
                arrayList.add(pqm0Var);
            }
        }
        for (Map.Entry entry2 : kkc0.m56705r0(arrayList).entrySet()) {
        }
        k6uVarM2814u.m55618s(new nl60(linkedHashMap).toString());
        u4uVar.f226799a.m73616a(k6uVarM2814u.build());
    }

    @Override // p204p.l201
    /* JADX INFO: renamed from: a */
    public final void mo49430a() {
        wxf1.m89255l(this.f226803e, oyf1.m68486s(b0g1.m27776L(mvl0.m62953p(new s2t(this.f226800b, 11)), new mdr(this, null, 15)), new C2537wj(22)));
    }

    @Override // p204p.l201
    public final void end() {
        qlg1.m73215t(this.f226803e.f35578a);
        this.f226802d = null;
    }
}
