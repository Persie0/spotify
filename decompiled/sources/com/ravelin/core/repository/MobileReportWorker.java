package com.ravelin.core.repository;

import android.content.Context;
import android.os.Parcelable;
import androidx.work.WorkerParameters;
import com.ravelin.core.model.MobileReportRequest;
import kotlin.Metadata;
import p204p.alk0;
import p204p.b890;
import p204p.bga;
import p204p.c890;
import p204p.e890;
import p204p.epv0;
import p204p.fbk;
import p204p.gk71;
import p204p.hbh0;
import p204p.ibk;
import p204p.juk;
import p204p.p4b1;
import p204p.q0f1;
import p204p.rzb0;
import p204p.utu0;
import p204p.w2a1;
import p204p.wj50;
import p204p.x0h1;
import p204p.yuk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/ravelin/core/repository/MobileReportWorker;", "Lcom/ravelin/core/repository/RavelinWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "core_release"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class MobileReportWorker extends RavelinWorker {
    public MobileReportWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.ravelin.core.repository.RavelinWorker, androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: f */
    public final Object mo750f(fbk fbkVar) throws Throwable {
        hbh0 hbh0Var;
        w2a1 w2a1Var;
        if (fbkVar instanceof hbh0) {
            hbh0Var = (hbh0) fbkVar;
            int i = hbh0Var.f89539c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hbh0Var.f89539c = i - Integer.MIN_VALUE;
            } else {
                hbh0Var = new hbh0(this, (ibk) fbkVar);
            }
        } else {
            hbh0Var = new hbh0(this, (ibk) fbkVar);
        }
        Object objM89557A = hbh0Var.f89537a;
        int i2 = hbh0Var.f89539c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM89557A);
                WorkerParameters workerParameters = this.f66917b;
                if (workerParameters.f1405c > 72) {
                    return new b890();
                }
                String strM77815d = workerParameters.f1404b.m77815d("Api");
                String strM77815d2 = workerParameters.f1404b.m77815d("MobileReportRequest");
                fbk fbkVar2 = null;
                if (strM77815d != null) {
                    m2227i(strM77815d);
                    w2a1Var = w2a1.f247311a;
                } else {
                    w2a1Var = null;
                }
                if (w2a1Var == null) {
                    return new b890();
                }
                MobileReportRequest mobileReportRequest = (MobileReportRequest) (strM77815d2 != null ? (Parcelable) q0f1.m71831e(new p4b1(14)).m41880a(strM77815d2, epv0.m39700t(MobileReportRequest.INSTANCE.serializer())) : null);
                alk0 alk0Var = this.f2663i;
                if (alk0Var == null) {
                    wj50.m88260d0("coroutineContextProvider");
                    throw null;
                }
                juk jukVarM26348a = alk0Var.m26348a();
                rzb0 rzb0Var = new rzb0(this, strM77815d, mobileReportRequest, fbkVar2, 8);
                hbh0Var.f89539c = 1;
                objM89557A = x0h1.m89557A(jukVarM26348a, rzb0Var, hbh0Var);
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
            String message = e.getMessage();
            utu0 utu0Var = gk71.f80747a;
            utu0Var.m83940H("MobileReportError");
            utu0Var.m83952u(message, new Object[0]);
            return new c890();
        }
    }
}
