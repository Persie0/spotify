package p204p;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class r3e1 implements qql0 {

    /* JADX INFO: renamed from: a */
    public final fqa1 f195501a;

    /* JADX INFO: renamed from: b */
    public final wt80 f195502b;

    /* JADX INFO: renamed from: c */
    public final luk f195503c;

    public r3e1(fqa1 fqa1Var, wt80 wt80Var, luk lukVar) {
        this.f195501a = fqa1Var;
        this.f195502b = wt80Var;
        this.f195503c = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m74639b(r3e1 r3e1Var, ibk ibkVar) {
        q3e1 q3e1Var;
        Set setMo48706a;
        hv31 hv31Var;
        Set set;
        Set set2;
        LinkedHashSet linkedHashSet;
        Map map;
        LinkedHashSet linkedHashSet2;
        p2x0 p2x0Var;
        qu80 qu80Var;
        ybv ybvVar;
        if (ibkVar instanceof q3e1) {
            q3e1Var = (q3e1) ibkVar;
            int i = q3e1Var.f184874h;
            if ((i & Integer.MIN_VALUE) != 0) {
                q3e1Var.f184874h = i - Integer.MIN_VALUE;
            } else {
                q3e1Var = new q3e1(r3e1Var, ibkVar);
            }
        } else {
            q3e1Var = new q3e1(r3e1Var, ibkVar);
        }
        Object objM42411a = q3e1Var.f184872f;
        int i2 = q3e1Var.f184874h;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM42411a);
                fqa1 fqa1Var = r3e1Var.f195501a;
                q3e1Var.f184874h = 1;
                objM42411a = fqa1Var.m42411a(q3e1Var);
                if (objM42411a != yukVar) {
                }
                return yukVar;
            }
            if (i2 == 1) {
                bga.m29073P(objM42411a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                linkedHashSet = q3e1Var.f184871e;
                set2 = q3e1Var.f184870d;
                set = q3e1Var.f184869c;
                setMo48706a = q3e1Var.f184868b;
                hv31Var = q3e1Var.f184867a;
                bga.m29073P(objM42411a);
            }
            map = (Map) objM42411a;
            linkedHashSet2 = new LinkedHashSet();
            for (Object obj : linkedHashSet) {
                p2x0Var = (p2x0) map.get((String) obj);
                if (p2x0Var == null && (qu80Var = (qu80) p2x0Var.m68970c()) != null && (ybvVar = qu80Var.f192599e) != null && !ybvVar.f271262g) {
                    linkedHashSet2.add(obj);
                }
            }
            if (!linkedHashSet2.isEmpty()) {
                lv31 lv31VarEdit = hv31Var.edit();
                lv31VarEdit.m60052e(w3e1.f247576a, s601.m77305h0(setMo48706a, linkedHashSet2));
                lv31VarEdit.m60052e(w3e1.f247577b, s601.m77305h0(set, linkedHashSet2));
                lv31VarEdit.m60052e(w3e1.f247578c, s601.m77305h0(set2, linkedHashSet2));
                lv31VarEdit.m60054g();
            }
            return w2a1Var;
            hv31 hv31Var2 = (hv31) objM42411a;
            setMo48706a = hv31Var2.mo48706a(w3e1.f247576a);
            Set setMo48706a2 = hv31Var2.mo48706a(w3e1.f247577b);
            Set setMo48706a3 = hv31Var2.mo48706a(w3e1.f247578c);
            LinkedHashSet linkedHashSetM77309l0 = s601.m77309l0(s601.m77309l0(setMo48706a, setMo48706a2), setMo48706a3);
            if (!linkedHashSetM77309l0.isEmpty()) {
                int iM31820L = c95.m31820L(i6f.m49804T(linkedHashSetM77309l0, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (Object obj2 : linkedHashSetM77309l0) {
                    linkedHashMap.put(obj2, new vt80((String) obj2, s3e1.f205276a));
                }
                wt80 wt80Var = r3e1Var.f195502b;
                q3e1Var.f184867a = hv31Var2;
                q3e1Var.f184868b = setMo48706a;
                q3e1Var.f184869c = setMo48706a2;
                q3e1Var.f184870d = setMo48706a3;
                q3e1Var.f184871e = linkedHashSetM77309l0;
                q3e1Var.f184874h = 2;
                Object objM62842g = ((mu80) wt80Var).m62842g(linkedHashMap, null, q3e1Var);
                if (objM62842g != yukVar) {
                    hv31Var = hv31Var2;
                    set = setMo48706a2;
                    set2 = setMo48706a3;
                    objM42411a = objM62842g;
                    linkedHashSet = linkedHashSetM77309l0;
                    map = (Map) objM42411a;
                    linkedHashSet2 = new LinkedHashSet();
                    while (r14.hasNext()) {
                        p2x0Var = (p2x0) map.get((String) obj);
                        if (p2x0Var == null) {
                        }
                    }
                    if (!linkedHashSet2.isEmpty()) {
                        lv31 lv31VarEdit2 = hv31Var.edit();
                        lv31VarEdit2.m60052e(w3e1.f247576a, s601.m77305h0(setMo48706a, linkedHashSet2));
                        lv31VarEdit2.m60052e(w3e1.f247577b, s601.m77305h0(set, linkedHashSet2));
                        lv31VarEdit2.m60052e(w3e1.f247578c, s601.m77305h0(set2, linkedHashSet2));
                        lv31VarEdit2.m60054g();
                    }
                }
                return yukVar;
            }
        } catch (Exception unused) {
        }
        return w2a1Var;
    }

    @Override // p204p.qql0
    /* JADX INFO: renamed from: a */
    public final void mo25857a() {
        x0h1.m89578u(kk40.m56661c(this.f195503c), null, 0, new pwb1(this, null, 22), 3);
    }

    @Override // p204p.qql0
    public final String getName() {
        return "WorkoutPlaylistCleanupOperation";
    }
}
