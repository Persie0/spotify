package p204p;

import com.spotify.campfire.chatcontentpickerpage.search.domain.EntityType;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class grj implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ edv f83775a;

    public grj(edv edvVar) {
        this.f83775a = edvVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L25;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        frj frjVar;
        if (ibkVar instanceof frj) {
            frjVar = (frj) ibkVar;
            int i = frjVar.f72491b;
            if ((i & Integer.MIN_VALUE) != 0) {
                frjVar.f72491b = i - Integer.MIN_VALUE;
            } else {
                frjVar = new frj(this, ibkVar);
            }
        } else {
            frjVar = new frj(this, ibkVar);
        }
        Object objM38621a = frjVar.f72490a;
        int i2 = frjVar.f72491b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = frjVar.f72493d;
                bga.m29073P(objM38621a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM38621a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM38621a);
        frjVar.f72493d = bqz0Var;
        frjVar.f72491b = 1;
        objM38621a = this.f83775a.m38621a(frjVar);
        if (objM38621a != yukVar) {
        }
        return yukVar;
        List list = (List) objM38621a;
        ro80 ro80VarM44508o = geg1.m44508o();
        ro80VarM44508o.add(eyy.f64219a);
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(dyu.m37364I((EntityType) it.next()));
        }
        ro80VarM44508o.addAll(arrayList);
        qqj qqjVar = new qqj(opo.m67574x(geg1.m44506m(ro80VarM44508o)));
        frjVar.f72493d = null;
        frjVar.f72491b = 2;
    }
}
