package p204p;

import android.net.Uri;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes5.dex */
public final class r2j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ s2j f195155a;

    public r2j(s2j s2jVar) {
        this.f195155a = s2jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m74554a(Uri uri, ibk ibkVar) {
        q2j q2jVar;
        if (ibkVar instanceof q2j) {
            q2jVar = (q2j) ibkVar;
            int i = q2jVar.f184653c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q2jVar.f184653c = i - Integer.MIN_VALUE;
            } else {
                q2jVar = new q2j(this, ibkVar);
            }
        } else {
            q2jVar = new q2j(this, ibkVar);
        }
        Object obj = q2jVar.f184651a;
        int i2 = q2jVar.f184653c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        jyx0 jyx0Var = this.f195155a.f205021c;
        Single singleFlatMap = jyx0Var.m54822a().flatMap(new iyx0(jyx0Var, uri, 0));
        q2jVar.f184653c = 1;
        Object objM96567o = zn91.m96567o(singleFlatMap, q2jVar);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }
}
