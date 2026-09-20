package p204p;

import android.content.Context;
import com.spotify.audio.record.AudioRecordingException;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class w47 {

    /* JADX INFO: renamed from: a */
    public final p0a f247720a;

    /* JADX INFO: renamed from: b */
    public final y0a f247721b;

    /* JADX INFO: renamed from: c */
    public final j47 f247722c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f247723d;

    /* JADX INFO: renamed from: e */
    public final lsi0 f247724e = msi0.m62770a();

    /* JADX INFO: renamed from: f */
    public final AtomicReference f247725f = new AtomicReference(null);

    /* JADX INFO: renamed from: g */
    public final az1 f247726g;

    /* JADX INFO: renamed from: h */
    public final AtomicReference f247727h;

    /* JADX INFO: renamed from: i */
    public final q47 f247728i;

    /* JADX INFO: renamed from: j */
    public final wg61 f247729j;

    /* JADX INFO: renamed from: k */
    public final Subject f247730k;

    /* JADX INFO: renamed from: l */
    public final twz0 f247731l;

    public w47(inn innVar, p0a p0aVar, y0a y0aVar, j47 j47Var, Scheduler scheduler) {
        this.f247720a = p0aVar;
        this.f247721b = y0aVar;
        this.f247722c = j47Var;
        this.f247723d = scheduler;
        az1 az1Var = new az1();
        this.f247726g = az1Var;
        this.f247727h = new AtomicReference(null);
        ac5 ac5Var = new ac5(az1Var, 21);
        v47 v47Var = new v47(this, 0);
        son sonVar = innVar.f104034a.f201303a;
        this.f247728i = new q47((Context) sonVar.f212437t1.f246642a, ac5Var, (hz6) sonVar.f212517w3.get(), j47Var, v47Var);
        this.f247729j = new wg61(new so5(this, 12));
        this.f247730k = BehaviorSubject.m23796g(Boolean.FALSE).m23811c();
        this.f247731l = new twz0(this);
    }

    /* JADX INFO: renamed from: a */
    public final Flowable m87164a() {
        try {
            return (Flowable) this.f247729j.getValue();
        } catch (AudioRecordingException e) {
            return Flowable.m23326x(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0094 A[PHI: r11
      0x0094: PHI (r11v12 p.jsi0) = (r11v6 p.jsi0), (r11v16 p.jsi0) binds: [B:40:0x0092, B:48:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0096 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:39:0x0088, B:42:0x0096, B:30:0x0069, B:32:0x0071), top: B:55:0x0069 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b0 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:14:0x002f, B:46:0x00aa, B:49:0x00b0), top: B:57:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m87165b(ibk ibkVar) {
        u47 u47Var;
        jsi0 jsi0Var;
        int i;
        jsi0 jsi0Var2;
        jsi0 jsi0Var3;
        Throwable th;
        List listM68690a;
        Object objM92555a;
        t47 t47Var;
        r0a r0aVar;
        if (ibkVar instanceof u47) {
            u47Var = (u47) ibkVar;
            int i2 = u47Var.f226616f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u47Var.f226616f = i2 - Integer.MIN_VALUE;
            } else {
                u47Var = new u47(this, ibkVar);
            }
        } else {
            u47Var = new u47(this, ibkVar);
        }
        Object obj = u47Var.f226614d;
        int i3 = u47Var.f226616f;
        AtomicReference atomicReference = this.f247725f;
        int i4 = 0;
        yuk yukVar = yuk.f276404a;
        try {
            if (i3 == 0) {
                bga.m29073P(obj);
                jsi0Var = this.f247724e;
                u47Var.f226611a = jsi0Var;
                u47Var.f226612b = 0;
                u47Var.f226616f = 1;
                if (jsi0Var.mo54248a(u47Var) != yukVar) {
                    i = 0;
                }
                return yukVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jsi0Var3 = u47Var.f226611a;
                    try {
                        bga.m29073P(obj);
                        r0aVar = (r0a) obj;
                        if (r0aVar == null) {
                            jsi0Var = jsi0Var3;
                            t47Var = null;
                        } else {
                            t47Var = new t47(this, r0aVar);
                            atomicReference.set(t47Var);
                            jsi0Var = jsi0Var3;
                        }
                        jsi0Var.mo54249c(null);
                        return t47Var;
                    } catch (Throwable th2) {
                        th = th2;
                        jsi0Var3.mo54249c(null);
                        throw th;
                    }
                }
                i4 = u47Var.f226613c;
                i = u47Var.f226612b;
                jsi0Var2 = u47Var.f226611a;
                try {
                    bga.m29073P(obj);
                    jsi0Var = jsi0Var2;
                    listM68690a = this.f247720a.m68690a();
                    if (!listM68690a.isEmpty()) {
                        y0a y0aVar = this.f247721b;
                        u47Var.f226611a = jsi0Var;
                        u47Var.f226612b = i;
                        u47Var.f226613c = i4;
                        u47Var.f226616f = 3;
                        objM92555a = y0aVar.m92555a(listM68690a, u47Var);
                        if (objM92555a != yukVar) {
                            jsi0Var3 = jsi0Var;
                            obj = objM92555a;
                            r0aVar = (r0a) obj;
                            if (r0aVar == null) {
                                jsi0Var = jsi0Var3;
                                t47Var = null;
                            } else {
                                t47Var = new t47(this, r0aVar);
                                atomicReference.set(t47Var);
                                jsi0Var = jsi0Var3;
                            }
                        }
                        return yukVar;
                    }
                    t47Var = null;
                    jsi0Var.mo54249c(null);
                    return t47Var;
                } catch (Throwable th3) {
                    th = th3;
                    jsi0Var3 = jsi0Var2;
                    jsi0Var3.mo54249c(null);
                    throw th;
                }
            }
            i = u47Var.f226612b;
            jsi0 jsi0Var4 = u47Var.f226611a;
            bga.m29073P(obj);
            jsi0Var = jsi0Var4;
            t47 t47Var2 = (t47) atomicReference.get();
            if (t47Var2 == null) {
                listM68690a = this.f247720a.m68690a();
                if (!listM68690a.isEmpty()) {
                    t47Var = null;
                } else {
                    y0a y0aVar2 = this.f247721b;
                    u47Var.f226611a = jsi0Var;
                    u47Var.f226612b = i;
                    u47Var.f226613c = i4;
                    u47Var.f226616f = 3;
                    objM92555a = y0aVar2.m92555a(listM68690a, u47Var);
                    if (objM92555a != yukVar) {
                        jsi0Var3 = jsi0Var;
                        obj = objM92555a;
                        r0aVar = (r0a) obj;
                        if (r0aVar == null) {
                            jsi0Var = jsi0Var3;
                            t47Var = null;
                        } else {
                            t47Var = new t47(this, r0aVar);
                            atomicReference.set(t47Var);
                            jsi0Var = jsi0Var3;
                        }
                    }
                }
                jsi0Var.mo54249c(null);
                return t47Var;
            }
            u47Var.f226611a = jsi0Var;
            u47Var.f226612b = i;
            u47Var.f226613c = 0;
            u47Var.f226616f = 2;
            if (t47Var2.m80057a(u47Var) != yukVar) {
                jsi0Var2 = jsi0Var;
                jsi0Var = jsi0Var2;
                listM68690a = this.f247720a.m68690a();
                if (!listM68690a.isEmpty()) {
                    t47Var = null;
                } else {
                    y0a y0aVar3 = this.f247721b;
                    u47Var.f226611a = jsi0Var;
                    u47Var.f226612b = i;
                    u47Var.f226613c = i4;
                    u47Var.f226616f = 3;
                    objM92555a = y0aVar3.m92555a(listM68690a, u47Var);
                    if (objM92555a != yukVar) {
                        jsi0Var3 = jsi0Var;
                        obj = objM92555a;
                        r0aVar = (r0a) obj;
                        if (r0aVar == null) {
                            jsi0Var = jsi0Var3;
                            t47Var = null;
                        } else {
                            t47Var = new t47(this, r0aVar);
                            atomicReference.set(t47Var);
                            jsi0Var = jsi0Var3;
                        }
                    }
                }
                jsi0Var.mo54249c(null);
                return t47Var;
            }
            return yukVar;
        } catch (Throwable th4) {
            jsi0Var3 = jsi0Var;
            th = th4;
            jsi0Var3.mo54249c(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m87166c(boolean z) {
        this.f247730k.onNext(Boolean.valueOf(z));
    }
}
