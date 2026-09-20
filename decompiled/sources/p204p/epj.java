package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.campfire.chatcontentpickerpage.gifs.proto.GifMedia;
import com.spotify.campfire.chatcontentpickerpage.gifs.proto.PopularRequest;
import com.spotify.campfire.chatcontentpickerpage.gifs.proto.PopularResponse;
import com.spotify.campfire.chatcontentpickerpage.gifs.proto.SearchRequest;
import com.spotify.campfire.chatcontentpickerpage.gifs.proto.SearchResponse;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class epj implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ md10 f61654a;

    public epj(md10 md10Var) {
        this.f61654a = md10Var;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x009f A[Catch: CancellationException -> 0x0047, Exception -> 0x00c6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0047, blocks: (B:18:0x003f, B:57:0x00ea, B:58:0x00f0, B:59:0x0102, B:61:0x0108, B:62:0x0119, B:25:0x004e, B:49:0x00bf, B:28:0x005b, B:42:0x0097, B:45:0x009f, B:53:0x00c8, B:34:0x0069, B:36:0x0079), top: B:73:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8 A[Catch: CancellationException -> 0x0047, Exception -> 0x00c6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0047, blocks: (B:18:0x003f, B:57:0x00ea, B:58:0x00f0, B:59:0x0102, B:61:0x0108, B:62:0x0119, B:25:0x004e, B:49:0x00bf, B:28:0x005b, B:42:0x0097, B:45:0x009f, B:53:0x00c8, B:34:0x0069, B:36:0x0079), top: B:73:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0108 A[Catch: Exception -> 0x0044, CancellationException -> 0x0047, LOOP:0: B:59:0x0102->B:61:0x0108, LOOP_END, TryCatch #1 {CancellationException -> 0x0047, blocks: (B:18:0x003f, B:57:0x00ea, B:58:0x00f0, B:59:0x0102, B:61:0x0108, B:62:0x0119, B:25:0x004e, B:49:0x00bf, B:28:0x005b, B:42:0x0097, B:45:0x009f, B:53:0x00c8, B:34:0x0069, B:36:0x0079), top: B:73:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0141, code lost:
    
        if (r13.mo30229d(r1, r0) == r8) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        dpj dpjVar;
        Object tojVar;
        String string;
        bqz0 bqz0Var2;
        int i;
        poj pojVar;
        String str;
        int i2;
        boolean zM88460J0;
        md10 md10Var;
        ?? r12;
        ae50<GifMedia> ae50VarM4206n;
        ArrayList arrayList;
        ?? r13;
        if (ibkVar instanceof dpj) {
            dpjVar = (dpj) ibkVar;
            int i3 = dpjVar.f51342b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dpjVar.f51342b = i3 - Integer.MIN_VALUE;
            } else {
                dpjVar = new dpj(this, ibkVar);
            }
        } else {
            dpjVar = new dpj(this, ibkVar);
        }
        Object objM61503b = dpjVar.f51341a;
        int i4 = dpjVar.f51342b;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                try {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            i2 = dpjVar.f51347g;
                            str = dpjVar.f51346f;
                            poj pojVar2 = dpjVar.f51345e;
                            bqz0Var2 = dpjVar.f51344d;
                            try {
                                bga.m29073P(objM61503b);
                                pojVar = pojVar2;
                            } catch (Exception e) {
                                e = e;
                                obj = pojVar2;
                                bqz0Var = bqz0Var2;
                                Logger.m3967c(e, edb.m38564m("ChatContentPicker: Failed to load gifs for query: ", obj.f179719a), new Object[0]);
                                tojVar = new toj(e);
                                dpjVar.f51344d = null;
                                dpjVar.f51345e = null;
                                dpjVar.f51346f = null;
                                dpjVar.f51342b = 4;
                            }
                        } else if (i4 == 2) {
                            poj pojVar3 = dpjVar.f51345e;
                            bqz0Var = dpjVar.f51344d;
                            bga.m29073P(objM61503b);
                            r12 = pojVar3;
                            ae50VarM4206n = ((PopularResponse) objM61503b).m4206n();
                            obj = r12;
                            wj50.m88279p(ae50VarM4206n);
                            arrayList = new ArrayList(i6f.m49804T(ae50VarM4206n, 10));
                            for (GifMedia gifMedia : ae50VarM4206n) {
                                wj50.m88279p(gifMedia);
                                arrayList.add(qqg1.m73554x(gifMedia));
                            }
                            tojVar = new voj(opo.m67574x(arrayList));
                            dpjVar.f51344d = null;
                            dpjVar.f51345e = null;
                            dpjVar.f51346f = null;
                            dpjVar.f51342b = 4;
                        } else if (i4 == 3) {
                            poj pojVar4 = dpjVar.f51345e;
                            bqz0Var = dpjVar.f51344d;
                            bga.m29073P(objM61503b);
                            r13 = pojVar4;
                            ae50VarM4206n = ((SearchResponse) objM61503b).m4211n();
                            obj = r13;
                            wj50.m88279p(ae50VarM4206n);
                            arrayList = new ArrayList(i6f.m49804T(ae50VarM4206n, 10));
                            while (r14.hasNext()) {
                                wj50.m88279p(gifMedia);
                                arrayList.add(qqg1.m73554x(gifMedia));
                            }
                            tojVar = new voj(opo.m67574x(arrayList));
                            dpjVar.f51344d = null;
                            dpjVar.f51345e = null;
                            dpjVar.f51346f = null;
                            dpjVar.f51342b = 4;
                        } else {
                            if (i4 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bga.m29073P(objM61503b);
                        }
                        return w2a1.f247311a;
                    }
                    bga.m29073P(objM61503b);
                    poj pojVar5 = (poj) obj;
                    string = wl51.m88491o1(pojVar5.f179719a).toString();
                    if (wl51.m88460J0(string)) {
                        bqz0Var2 = bqz0Var;
                        i = 0;
                        obj = pojVar5;
                        zM88460J0 = wl51.m88460J0(string);
                        md10Var = this.f61654a;
                        if (zM88460J0) {
                            y9q0 y9q0VarM4205p = PopularRequest.m4205p();
                            y9q0VarM4205p.m93157m();
                            PopularRequest popularRequest = (PopularRequest) y9q0VarM4205p.build();
                            dpjVar.f51344d = bqz0Var2;
                            dpjVar.f51345e = obj;
                            dpjVar.f51346f = null;
                            dpjVar.f51347g = i;
                            dpjVar.f51342b = 2;
                            objM61503b = md10Var.m61502a(popularRequest, dpjVar);
                            if (objM61503b == yukVar) {
                                bqz0Var = bqz0Var2;
                                r12 = obj;
                                ae50VarM4206n = ((PopularResponse) objM61503b).m4206n();
                                obj = r12;
                                wj50.m88279p(ae50VarM4206n);
                                arrayList = new ArrayList(i6f.m49804T(ae50VarM4206n, 10));
                                while (r14.hasNext()) {
                                    wj50.m88279p(gifMedia);
                                    arrayList.add(qqg1.m73554x(gifMedia));
                                }
                                tojVar = new voj(opo.m67574x(arrayList));
                                dpjVar.f51344d = null;
                                dpjVar.f51345e = null;
                                dpjVar.f51346f = null;
                                dpjVar.f51342b = 4;
                            }
                        } else {
                            mzy0 mzy0VarM4210q = SearchRequest.m4210q();
                            mzy0VarM4210q.m63271r(string);
                            mzy0VarM4210q.m63269m();
                            SearchRequest searchRequest = (SearchRequest) mzy0VarM4210q.build();
                            dpjVar.f51344d = bqz0Var2;
                            dpjVar.f51345e = obj;
                            dpjVar.f51346f = null;
                            dpjVar.f51347g = i;
                            dpjVar.f51342b = 3;
                            objM61503b = md10Var.m61503b(searchRequest, dpjVar);
                            if (objM61503b == yukVar) {
                                bqz0Var = bqz0Var2;
                                r13 = obj;
                                ae50VarM4206n = ((SearchResponse) objM61503b).m4211n();
                                obj = r13;
                                wj50.m88279p(ae50VarM4206n);
                                arrayList = new ArrayList(i6f.m49804T(ae50VarM4206n, 10));
                                while (r14.hasNext()) {
                                    wj50.m88279p(gifMedia);
                                    arrayList.add(qqg1.m73554x(gifMedia));
                                }
                                tojVar = new voj(opo.m67574x(arrayList));
                                dpjVar.f51344d = null;
                                dpjVar.f51345e = null;
                                dpjVar.f51346f = null;
                                dpjVar.f51342b = 4;
                            }
                        }
                    } else {
                        dpjVar.f51344d = bqz0Var;
                        dpjVar.f51345e = pojVar5;
                        dpjVar.f51346f = string;
                        dpjVar.f51347g = 0;
                        dpjVar.f51342b = 1;
                        if (njg1.m64619l(300L, dpjVar) != yukVar) {
                            pojVar = pojVar5;
                            bqz0Var2 = bqz0Var;
                            str = string;
                            i2 = 0;
                        }
                    }
                    return yukVar;
                    zM88460J0 = wl51.m88460J0(string);
                    md10Var = this.f61654a;
                    if (zM88460J0) {
                        y9q0 y9q0VarM4205p2 = PopularRequest.m4205p();
                        y9q0VarM4205p2.m93157m();
                        PopularRequest popularRequest2 = (PopularRequest) y9q0VarM4205p2.build();
                        dpjVar.f51344d = bqz0Var2;
                        dpjVar.f51345e = obj;
                        dpjVar.f51346f = null;
                        dpjVar.f51347g = i;
                        dpjVar.f51342b = 2;
                        objM61503b = md10Var.m61502a(popularRequest2, dpjVar);
                        if (objM61503b == yukVar) {
                            bqz0Var = bqz0Var2;
                            r12 = obj;
                            ae50VarM4206n = ((PopularResponse) objM61503b).m4206n();
                            obj = r12;
                            wj50.m88279p(ae50VarM4206n);
                            arrayList = new ArrayList(i6f.m49804T(ae50VarM4206n, 10));
                            while (r14.hasNext()) {
                                wj50.m88279p(gifMedia);
                                arrayList.add(qqg1.m73554x(gifMedia));
                            }
                            tojVar = new voj(opo.m67574x(arrayList));
                            dpjVar.f51344d = null;
                            dpjVar.f51345e = null;
                            dpjVar.f51346f = null;
                            dpjVar.f51342b = 4;
                        }
                        return yukVar;
                    }
                    mzy0 mzy0VarM4210q2 = SearchRequest.m4210q();
                    mzy0VarM4210q2.m63271r(string);
                    mzy0VarM4210q2.m63269m();
                    SearchRequest searchRequest2 = (SearchRequest) mzy0VarM4210q2.build();
                    dpjVar.f51344d = bqz0Var2;
                    dpjVar.f51345e = obj;
                    dpjVar.f51346f = null;
                    dpjVar.f51347g = i;
                    dpjVar.f51342b = 3;
                    objM61503b = md10Var.m61503b(searchRequest2, dpjVar);
                    if (objM61503b == yukVar) {
                        bqz0Var = bqz0Var2;
                        r13 = obj;
                        ae50VarM4206n = ((SearchResponse) objM61503b).m4211n();
                        obj = r13;
                        wj50.m88279p(ae50VarM4206n);
                        arrayList = new ArrayList(i6f.m49804T(ae50VarM4206n, 10));
                        while (r14.hasNext()) {
                            wj50.m88279p(gifMedia);
                            arrayList.add(qqg1.m73554x(gifMedia));
                        }
                        tojVar = new voj(opo.m67574x(arrayList));
                        dpjVar.f51344d = null;
                        dpjVar.f51345e = null;
                        dpjVar.f51346f = null;
                        dpjVar.f51342b = 4;
                    }
                    return yukVar;
                } catch (Exception e2) {
                    e = e2;
                    bqz0Var = bqz0Var2;
                    Logger.m3967c(e, edb.m38564m("ChatContentPicker: Failed to load gifs for query: ", obj.f179719a), new Object[0]);
                    tojVar = new toj(e);
                }
                string = str;
                i = i2;
                obj = pojVar;
            } catch (CancellationException e3) {
                throw e3;
            }
        } catch (Exception e4) {
            e = e4;
        }
        return yukVar;
    }
}
