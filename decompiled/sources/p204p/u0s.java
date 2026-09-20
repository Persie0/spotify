package p204p;

import com.spotify.lexicon.p094dj.p095v1.DJPersona;
import com.spotify.lexicon.p094dj.p095v1.GetAvailablePersonasResponse;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class u0s {

    /* JADX INFO: renamed from: a */
    public final Set f225594a;

    /* JADX INFO: renamed from: b */
    public final s0s f225595b;

    /* JADX INFO: renamed from: c */
    public final l3v f225596c;

    public u0s(Set set, s0s s0sVar, l3v l3vVar) {
        this.f225594a = set;
        this.f225595b = s0sVar;
        this.f225596c = l3vVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m82127a(ibk ibkVar) {
        t0s t0sVar;
        if (ibkVar instanceof t0s) {
            t0sVar = (t0s) ibkVar;
            int i = t0sVar.f215974c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t0sVar.f215974c = i - Integer.MIN_VALUE;
            } else {
                t0sVar = new t0s(this, ibkVar);
            }
        } else {
            t0sVar = new t0s(this, ibkVar);
        }
        Object objM76897a = t0sVar.f215972a;
        int i2 = t0sVar.f215974c;
        if (i2 == 0) {
            bga.m29073P(objM76897a);
            if (!this.f225596c.f129445a.m38342c()) {
                return this.f225594a;
            }
            t0sVar.f215974c = 1;
            objM76897a = this.f225595b.m76897a(t0sVar);
            yuk yukVar = yuk.f276404a;
            if (objM76897a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76897a);
        }
        ae50<DJPersona> ae50VarM12594n = ((GetAvailablePersonasResponse) objM76897a).m12594n();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM12594n, 10));
        for (DJPersona dJPersona : ae50VarM12594n) {
            wj50.m88279p(dJPersona);
            arrayList.add(wtg1.m88939n(dJPersona));
        }
        return g6f.m43736n1(arrayList);
    }
}
