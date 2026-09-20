package p204p;

import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class epe implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ s611 f61633a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hb11 f61634b;

    public epe(s611 s611Var, hb11 hb11Var) {
        this.f61633a = s611Var;
        this.f61634b = hb11Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011b, code lost:
    
        if (r8.mo30229d(r1, r2) == r13) goto L35;
     */
    /* JADX WARN: Type inference failed for: r15v3, types: [p.bqz0, p.gpe, p.plv0, p.ty81] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8 */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        dpe dpeVar;
        wme wmeVar;
        boolean z;
        bqz0 bqz0Var2;
        yuk yukVar;
        gpe gpeVar;
        plv0 plv0Var;
        int i;
        ty81 ty81Var;
        gpe gpeVar2;
        bqz0 bqz0Var3;
        ?? r15;
        if (ibkVar instanceof dpe) {
            dpeVar = (dpe) ibkVar;
            int i2 = dpeVar.f51309b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dpeVar.f51309b = i2 - Integer.MIN_VALUE;
            } else {
                dpeVar = new dpe(this, ibkVar);
            }
        } else {
            dpeVar = new dpe(this, ibkVar);
        }
        Object obj2 = dpeVar.f51308a;
        int i3 = dpeVar.f51309b;
        s611 s611Var = this.f61633a;
        yuk yukVar2 = yuk.f276404a;
        if (i3 != 0) {
            if (i3 == 1) {
                i = dpeVar.f51315h;
                plv0Var = dpeVar.f51313f;
                gpeVar = dpeVar.f51312e;
                bqz0 bqz0Var4 = dpeVar.f51311d;
                bga.m29073P(obj2);
                yukVar = yukVar2;
                bqz0Var2 = bqz0Var4;
                z = false;
            } else if (i3 == 2) {
                ty81Var = dpeVar.f51314g;
                plv0Var = dpeVar.f51313f;
                gpeVar2 = dpeVar.f51312e;
                bqz0Var3 = dpeVar.f51311d;
                bga.m29073P(obj2);
                yukVar = yukVar2;
                r15 = 0;
                npe npeVar = new npe(ty81Var, gpeVar2.f83175c.f232649c, plv0Var.f178796a);
                dpeVar.f51311d = r15;
                dpeVar.f51312e = r15;
                dpeVar.f51313f = r15;
                dpeVar.f51314g = r15;
                dpeVar.f51309b = 3;
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj2);
        gpe gpeVar3 = (gpe) obj;
        plv0 plv0Var2 = new plv0();
        upe upeVar = gpeVar3.f83175c;
        String str = upeVar.f232659m;
        if (str != null) {
            String str2 = upeVar.f232660n;
            if (str2 == null) {
                str2 = "";
            }
            wmeVar = new wme(str, str2, upeVar.f232661o.intValue(), upeVar.f232662p);
        } else {
            wmeVar = null;
        }
        Uri uri = Uri.parse(upeVar.f232647a);
        long j = upeVar.f232648b;
        long j2 = upeVar.f232655i;
        jb9 jb9VarM63166a = s611Var.f205978b.m63166a();
        s611Var.f205985i = jb9VarM63166a;
        z = false;
        woe woeVar = new woe(new r1a(nxf1.m65827f(new q611(s611Var, uri, wmeVar, j, j2, jb9VarM63166a, null)), new xvd((Object) this.f61634b, (Object) plv0Var2, (fbk) (false ? 1 : 0), 5), 8), 0);
        bqz0Var2 = bqz0Var;
        dpeVar.f51311d = bqz0Var2;
        dpeVar.f51312e = gpeVar3;
        dpeVar.f51313f = plv0Var2;
        dpeVar.f51314g = null;
        dpeVar.f51315h = 0;
        dpeVar.f51309b = 1;
        Object objM86755t = vyf1.m86755t(woeVar, dpeVar);
        yukVar = yukVar2;
        if (objM86755t != yukVar) {
            gpeVar = gpeVar3;
            obj2 = objM86755t;
            plv0Var = plv0Var2;
            i = 0;
        }
        return yukVar;
        ty81 ty81Var2 = (ty81) obj2;
        dpeVar.f51311d = bqz0Var2;
        dpeVar.f51312e = gpeVar;
        dpeVar.f51313f = plv0Var;
        dpeVar.f51314g = ty81Var2;
        dpeVar.f51315h = i;
        dpeVar.f51309b = 2;
        if (s611Var.m77313a(dpeVar) != yukVar) {
            ty81Var = ty81Var2;
            gpeVar2 = gpeVar;
            bqz0Var3 = bqz0Var2;
            r15 = z;
            npe npeVar2 = new npe(ty81Var, gpeVar2.f83175c.f232649c, plv0Var.f178796a);
            dpeVar.f51311d = r15;
            dpeVar.f51312e = r15;
            dpeVar.f51313f = r15;
            dpeVar.f51314g = r15;
            dpeVar.f51309b = 3;
        }
        return yukVar;
    }
}
