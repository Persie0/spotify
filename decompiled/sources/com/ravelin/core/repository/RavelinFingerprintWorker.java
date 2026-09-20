package com.ravelin.core.repository;

import android.content.Context;
import android.os.Parcelable;
import androidx.work.WorkerParameters;
import com.ravelin.core.model.Events;
import kotlin.Metadata;
import p204p.alk0;
import p204p.b890;
import p204p.bga;
import p204p.c890;
import p204p.e890;
import p204p.edb;
import p204p.epv0;
import p204p.fbk;
import p204p.gk71;
import p204p.ibk;
import p204p.juk;
import p204p.kau0;
import p204p.p4b1;
import p204p.q0f1;
import p204p.rgp0;
import p204p.utu0;
import p204p.wj50;
import p204p.x0h1;
import p204p.yuk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/ravelin/core/repository/RavelinFingerprintWorker;", "Lcom/ravelin/core/repository/RavelinWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "core_release"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class RavelinFingerprintWorker extends RavelinWorker {

    /* JADX INFO: renamed from: l */
    public static final String f2658l;

    static {
        String canonicalName = RavelinFingerprintWorker.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "RavelinFingerprintWorker";
        }
        f2658l = canonicalName;
    }

    public RavelinFingerprintWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.ravelin.core.repository.RavelinWorker, androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: f */
    public final Object mo750f(fbk fbkVar) throws Throwable {
        kau0 kau0Var;
        if (fbkVar instanceof kau0) {
            kau0Var = (kau0) fbkVar;
            int i = kau0Var.f120966c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kau0Var.f120966c = i - Integer.MIN_VALUE;
            } else {
                kau0Var = new kau0(this, (ibk) fbkVar);
            }
        } else {
            kau0Var = new kau0(this, (ibk) fbkVar);
        }
        Object objM89557A = kau0Var.f120964a;
        int i2 = kau0Var.f120966c;
        String str = f2658l;
        try {
            if (i2 == 0) {
                bga.m29073P(objM89557A);
                WorkerParameters workerParameters = this.f66917b;
                if (workerParameters.f1405c > 72) {
                    return new b890();
                }
                String strM77815d = workerParameters.f1404b.m77815d("Api");
                String strM77815d2 = workerParameters.f1404b.m77815d("Payload");
                String strM38566o = edb.m38566o("doWork was called with keys: apiKey - ", strM77815d, ", payloadKey - ", strM77815d2);
                utu0 utu0Var = gk71.f80747a;
                utu0Var.m83940H(str);
                utu0Var.m83952u(strM38566o, new Object[0]);
                if (strM77815d == null || strM77815d.length() == 0 || strM77815d2 == null || strM77815d2.length() == 0) {
                    utu0Var.m83940H(str);
                    utu0Var.m83952u("Failed with lack of information", new Object[0]);
                    return new b890();
                }
                m2227i(strM77815d);
                Events events = (Events) ((Parcelable) q0f1.m71831e(new p4b1(14)).m41880a(strM77815d2, epv0.m39700t(Events.INSTANCE.serializer())));
                alk0 alk0Var = this.f2663i;
                fbk fbkVar2 = null;
                if (alk0Var == null) {
                    wj50.m88260d0("coroutineContextProvider");
                    throw null;
                }
                juk jukVarM26348a = alk0Var.m26348a();
                rgp0 rgp0Var = new rgp0(this, strM77815d, events, fbkVar2, 12);
                kau0Var.f120966c = 1;
                objM89557A = x0h1.m89557A(jukVarM26348a, rgp0Var, kau0Var);
                yuk yukVar = yuk.f276404a;
                if (objM89557A == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89557A);
            }
            return (e890) objM89557A;
        } catch (Exception e) {
            String strM38564m = edb.m38564m("Failed to make api call with the following reason: ", e.getMessage());
            utu0 utu0Var2 = gk71.f80747a;
            utu0Var2.m83940H(str);
            utu0Var2.m83952u(strM38564m, new Object[0]);
            return new c890();
        }
    }
}
