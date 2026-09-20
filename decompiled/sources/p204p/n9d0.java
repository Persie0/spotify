package p204p;

import com.spotify.externalintegration.ubi.UbiSpecificationId;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class n9d0 implements h9d0 {

    /* JADX INFO: renamed from: a */
    public final chp f151772a;

    /* JADX INFO: renamed from: b */
    public final e9d0 f151773b;

    public n9d0(chp chpVar, e9d0 e9d0Var) {
        this.f151772a = chpVar;
        this.f151773b = e9d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p204p.h9d0
    /* JADX INFO: renamed from: a */
    public final Object mo38243a(g9d0 g9d0Var, ibk ibkVar) {
        m9d0 m9d0Var;
        UbiSpecificationId ubiSpecificationId;
        UbiSpecificationId ubiSpecificationId2;
        chp chpVar = this.f151772a;
        Map map = chpVar.f38055b;
        if (ibkVar instanceof m9d0) {
            m9d0Var = (m9d0) ibkVar;
            int i = m9d0Var.f141278d;
            if ((i & Integer.MIN_VALUE) != 0) {
                m9d0Var.f141278d = i - Integer.MIN_VALUE;
            } else {
                m9d0Var = new m9d0(this, ibkVar);
            }
        } else {
            m9d0Var = new m9d0(this, ibkVar);
        }
        Object obj = m9d0Var.f141276b;
        int i2 = m9d0Var.f141278d;
        Integer num = null;
        String str = "com.spotify.expanded-search-result";
        if (i2 == 0) {
            bga.m29073P(obj);
            String str2 = g9d0Var.f77733a;
            if (str2 == null) {
                str2 = g9d0Var.f77734b;
            }
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                UbiSpecificationId ubiSpecificationId3 = (UbiSpecificationId) entry.getKey();
                ((jw3) ((uw91) entry.getValue())).getClass();
                if (t0j.m79831l(str2)) {
                    ubiSpecificationId = ubiSpecificationId3;
                    break;
                }
            }
            chpVar.m32806c(new n0y(ubiSpecificationId, str, num, 12));
            m9d0Var.f141275a = ubiSpecificationId;
            m9d0Var.f141278d = 1;
            Object objMo38243a = this.f151773b.mo38243a(g9d0Var, m9d0Var);
            yuk yukVar = yuk.f276404a;
            if (objMo38243a == yukVar) {
                return yukVar;
            }
            UbiSpecificationId ubiSpecificationId4 = ubiSpecificationId;
            obj = objMo38243a;
            ubiSpecificationId2 = ubiSpecificationId4;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ubiSpecificationId2 = m9d0Var.f141275a;
            bga.m29073P(obj);
        }
        List list = (List) obj;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            int i3 = 0;
            for (Object obj2 : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    h6f.m46722S();
                    throw null;
                }
                arrayList.add(new m0y(((axx) obj2).f21021a, i3, "com.spotify.expanded-search-result"));
                i3 = i4;
            }
            if (map.containsKey(ubiSpecificationId2)) {
                chpVar.f38057d.put(ubiSpecificationId2, arrayList);
            }
        }
        return list;
    }

    @Override // p204p.h9d0
    /* JADX INFO: renamed from: b */
    public final Single mo46866b(g9d0 g9d0Var) {
        return vjf1.m85770t(dau.f47107a, new sqc0(this, g9d0Var, (fbk) null, 3));
    }
}
