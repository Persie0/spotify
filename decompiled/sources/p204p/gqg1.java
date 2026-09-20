package p204p;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.recaptcha.internal.zzhg;
import com.spotify.cosmos.cosmos.Request;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.TimeoutCancellationException;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class gqg1 {

    /* JADX INFO: renamed from: a */
    public final sep f83473a;

    /* JADX INFO: renamed from: b */
    public final CronetEngine f83474b;

    /* JADX INFO: renamed from: c */
    public final ExecutorService f83475c;

    public gqg1(sep sepVar, CronetEngine cronetEngine, ExecutorService executorService) {
        this.f83473a = sepVar;
        this.f83474b = cronetEngine;
        this.f83475c = executorService;
    }

    /* JADX INFO: renamed from: a */
    public final Object m45436a(String str, byte[] bArr, ibk ibkVar) {
        return m45437b(str, Request.POST, bArr, Collections.singletonMap("Content-Type", "application/x-protobuffer"), ibkVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: b */
    public final Object m45437b(String str, String str2, byte[] bArr, Map map, ibk ibkVar) {
        qpg1 qpg1Var;
        zz11 zz11Var = zz11.f287826e2;
        if (ibkVar instanceof qpg1) {
            qpg1Var = (qpg1) ibkVar;
            int i = qpg1Var.f191304d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qpg1Var.f191304d = i - Integer.MIN_VALUE;
            } else {
                qpg1Var = new qpg1(this, ibkVar);
            }
        } else {
            qpg1Var = new qpg1(this, ibkVar);
        }
        Object obj = qpg1Var.f191302b;
        int i2 = qpg1Var.f191304d;
        int i3 = 8;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return obj;
            }
            bga.m29073P(obj);
            Uri uri = Uri.parse(str);
            wj50.m88279p(uri);
            if (!TextUtils.isEmpty(uri.toString()) && pka1.f178421b.equals(uri.getScheme()) && !TextUtils.isEmpty(uri.getHost())) {
                String string = uri.toString();
                ArrayList arrayList = this.f83473a.f208338a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (bm51.m29803n0(string, (String) it.next(), false)) {
                            qpg1Var.f191301a = map;
                            qpg1Var.f191304d = 1;
                            hqb hqbVar = new hqb(1, seg1.m77914f(qpg1Var));
                            hqbVar.m48222q();
                            CronetEngine cronetEngine = this.f83474b;
                            kqg1 kqg1Var = new kqg1(hqbVar);
                            ExecutorService executorService = this.f83475c;
                            UrlRequest.Builder builderNewUrlRequestBuilder = cronetEngine.newUrlRequestBuilder(str, kqg1Var, executorService);
                            builderNewUrlRequestBuilder.setHttpMethod(str2);
                            for (Map.Entry entry : map.entrySet()) {
                                builderNewUrlRequestBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
                            }
                            if (bArr != null) {
                                builderNewUrlRequestBuilder.setUploadDataProvider(ltf1.m59889k(0, bArr, bArr.length), executorService);
                            }
                            builderNewUrlRequestBuilder.setTrafficStatsTag((int) Thread.currentThread().getId());
                            UrlRequest urlRequestBuild = builderNewUrlRequestBuilder.build();
                            urlRequestBuild.start();
                            hqbVar.mo42415l(new jt70(urlRequestBuild, 19));
                            Object objM48221p = hqbVar.m48221p();
                            yuk yukVar = yuk.f276404a;
                            return objM48221p == yukVar ? yukVar : objM48221p;
                        }
                    }
                }
            }
            throw new zzhg(zz11Var, zz11.f287791Q0, (String) null, 12);
        } catch (zzhg e) {
            throw e;
        } catch (TimeoutCancellationException e2) {
            throw new zzhg(zz11Var, zz11.f287824e, e2.getMessage(), i3);
        } catch (Exception e3) {
            throw new zzhg(zz11Var, zz11.f287806X0, e3.getMessage(), i3);
        }
    }
}
