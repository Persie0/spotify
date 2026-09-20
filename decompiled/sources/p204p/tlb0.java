package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes8.dex */
public final class tlb0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ujb0 f221435a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Flowable f221436b;

    public tlb0(ujb0 ujb0Var, Flowable flowable) {
        this.f221435a = ujb0Var;
        this.f221436b = flowable;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00df  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0119, code lost:
    
        if (r6.mo30229d(r9, r2) == r8) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [p.bqz0] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        slb0 slb0Var;
        Object c6x0Var;
        ?? r6;
        Throwable thM77348a;
        mlb0 mlb0Var;
        int i;
        bqz0 bqz0Var2;
        int i2;
        int i3;
        bqz0 bqz0Var3;
        Object obj2;
        String str;
        mlb0 mlb0Var2;
        xul0 xul0VarPlaybackId;
        String str2;
        String str3;
        if (ibkVar instanceof slb0) {
            slb0Var = (slb0) ibkVar;
            int i4 = slb0Var.f210354b;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                slb0Var.f210354b = i4 - Integer.MIN_VALUE;
            } else {
                slb0Var = new slb0(this, ibkVar);
            }
        } else {
            slb0Var = new slb0(this, ibkVar);
        }
        Object objM96567o = slb0Var.f210353a;
        int i5 = slb0Var.f210354b;
        ?? r7 = 1;
        yuk yukVar = yuk.f276404a;
        try {
            if (i5 == 0) {
                bga.m29073P(objM96567o);
                mlb0Var = (mlb0) obj;
                i = 0;
                try {
                    Single singleM23327A = this.f221436b.m23327A();
                    bqz0Var2 = bqz0Var;
                    try {
                        slb0Var.f210356d = bqz0Var2;
                        slb0Var.f210357e = mlb0Var;
                        slb0Var.f210359g = 0;
                        slb0Var.f210360h = 0;
                        slb0Var.f210354b = 1;
                        objM96567o = zn91.m96567o(singleM23327A, slb0Var);
                        if (objM96567o != yukVar) {
                            i2 = 0;
                        }
                    } catch (Throwable th) {
                        th = th;
                        i2 = 0;
                        Object c6x0Var2 = new c6x0(th);
                        bqz0 bqz0Var4 = bqz0Var2;
                        i3 = i2;
                        bqz0Var3 = bqz0Var4;
                        obj2 = c6x0Var2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bqz0Var2 = bqz0Var;
                }
                return yukVar;
            }
            if (i5 == 1) {
                i = slb0Var.f210360h;
                i2 = slb0Var.f210359g;
                mlb0Var = slb0Var.f210357e;
                bqz0Var2 = slb0Var.f210356d;
                try {
                    bga.m29073P(objM96567o);
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        Object c6x0Var3 = new c6x0(th);
                        bqz0 bqz0Var5 = bqz0Var2;
                        i3 = i2;
                        bqz0Var3 = bqz0Var5;
                        obj2 = c6x0Var3;
                    } catch (Throwable th4) {
                        th = th4;
                        r7 = bqz0Var2;
                        c6x0Var = new c6x0(th);
                        r6 = r7;
                    }
                }
            } else if (i5 == 2) {
                String str4 = slb0Var.f210358f;
                mlb0Var2 = slb0Var.f210357e;
                bqz0 bqz0Var6 = slb0Var.f210356d;
                bga.m29073P(objM96567o);
                str = str4;
                r7 = bqz0Var6;
                s7f s7fVar = (s7f) objM96567o;
                wab0 wab0Var = s7fVar.f206350a;
                str2 = wab0Var.f249436f.f207170c;
                if (str2.length() == 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                c6x0Var = new bmb0(wab0Var, s7fVar.f206351b, mlb0Var2.f144804a, str, str3, g6f.m43736n1(mlb0Var2.f144805b));
                r6 = r7;
                thM77348a = s6x0.m77348a(c6x0Var);
                if (thM77348a == null && !(thM77348a instanceof TimeoutCancellationException) && (thM77348a instanceof CancellationException)) {
                    throw thM77348a;
                }
                if (c6x0Var instanceof c6x0) {
                    c6x0Var = amb0.f17081a;
                }
                slb0Var.f210356d = null;
                slb0Var.f210357e = null;
                slb0Var.f210358f = null;
                slb0Var.f210354b = 3;
            } else {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            return w2a1.f247311a;
            obj2 = (PlayerState) objM96567o;
            bqz0 bqz0Var7 = bqz0Var2;
            i3 = i2;
            bqz0Var3 = bqz0Var7;
            if (obj2 instanceof c6x0) {
                obj2 = null;
            }
            PlayerState playerState = (PlayerState) obj2;
            String str5 = (playerState == null || (xul0VarPlaybackId = playerState.playbackId()) == null) ? null : (String) xul0VarPlaybackId.mo49283h();
            if (str5 == null) {
                str5 = "";
            }
            Single singleM83248c = this.f221435a.m83248c(mlb0Var.f144804a, str5, vdb0.SELECTION, null);
            slb0Var.f210356d = bqz0Var3;
            slb0Var.f210357e = mlb0Var;
            slb0Var.f210358f = str5;
            slb0Var.f210359g = i3;
            slb0Var.f210360h = i;
            slb0Var.f210354b = 2;
            Object objM96567o2 = zn91.m96567o(singleM83248c, slb0Var);
            if (objM96567o2 != yukVar) {
                str = str5;
                objM96567o = objM96567o2;
                mlb0Var2 = mlb0Var;
                r7 = bqz0Var3;
                s7f s7fVar2 = (s7f) objM96567o;
                wab0 wab0Var2 = s7fVar2.f206350a;
                str2 = wab0Var2.f249436f.f207170c;
                if (str2.length() == 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                c6x0Var = new bmb0(wab0Var2, s7fVar2.f206351b, mlb0Var2.f144804a, str, str3, g6f.m43736n1(mlb0Var2.f144805b));
                r6 = r7;
                thM77348a = s6x0.m77348a(c6x0Var);
                if (thM77348a == null) {
                }
                if (c6x0Var instanceof c6x0) {
                    c6x0Var = amb0.f17081a;
                }
                slb0Var.f210356d = null;
                slb0Var.f210357e = null;
                slb0Var.f210358f = null;
                slb0Var.f210354b = 3;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        return yukVar;
    }
}
