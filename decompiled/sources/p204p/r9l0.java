package p204p;

import android.view.ViewGroup;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class r9l0 implements cvb0 {

    /* JADX INFO: renamed from: a */
    public final fal0 f197074a;

    /* JADX INFO: renamed from: b */
    public final e9l0 f197075b;

    /* JADX INFO: renamed from: c */
    public final iml0 f197076c;

    /* JADX INFO: renamed from: d */
    public final v9l0 f197077d;

    /* JADX INFO: renamed from: e */
    public final ske f197078e;

    /* JADX INFO: renamed from: f */
    public final rg91 f197079f;

    /* JADX INFO: renamed from: g */
    public final c9k f197080g;

    /* JADX INFO: renamed from: h */
    public di41 f197081h;

    /* JADX INFO: renamed from: i */
    public di41 f197082i;

    /* JADX INFO: renamed from: t */
    public Boolean f197083t;

    public r9l0(fal0 fal0Var, e9l0 e9l0Var, iml0 iml0Var, v9l0 v9l0Var, ske skeVar, rg91 rg91Var, luk lukVar) {
        this.f197074a = fal0Var;
        this.f197075b = e9l0Var;
        this.f197076c = iml0Var;
        this.f197077d = v9l0Var;
        this.f197078e = skeVar;
        this.f197079f = rg91Var;
        this.f197080g = kk40.m56661c(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r5.m75081f(r0) == r4) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m75078a(r9l0 r9l0Var, fbk fbkVar) {
        m9l0 m9l0Var;
        if (fbkVar instanceof m9l0) {
            m9l0Var = (m9l0) fbkVar;
            int i = m9l0Var.f141332c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m9l0Var.f141332c = i - Integer.MIN_VALUE;
            } else {
                m9l0Var = new m9l0(r9l0Var, fbkVar);
            }
        } else {
            m9l0Var = new m9l0(r9l0Var, fbkVar);
        }
        Object obj = m9l0Var.f141330a;
        int i2 = m9l0Var.f141332c;
        Object obj2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            iml0 iml0Var = r9l0Var.f197076c;
            m9l0Var.f141332c = 1;
            if (((uml0) iml0Var).m83458e(true, m9l0Var) != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            bga.m29073P(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        r9l0Var.f197083t = qyg1.m74178H(true);
        return w2a1.f247311a;
        m9l0Var.f141332c = 2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x0081 A[PHI: r11
      0x0081: PHI (r11v12 java.lang.Object) = (r11v11 java.lang.Object), (r11v1 java.lang.Object) binds: [B:31:0x007e, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092 A[PHI: r11
      0x0092: PHI (r11v16 java.lang.Object) = (r11v15 java.lang.Object), (r11v1 java.lang.Object) binds: [B:36:0x008f, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        if (((p204p.uml0) r0).m83454a(r1) == r9) goto L42;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m75079b(r9l0 r9l0Var, fbk fbkVar) {
        n9l0 n9l0Var;
        iml0 iml0Var = r9l0Var.f197076c;
        if (fbkVar instanceof n9l0) {
            n9l0Var = (n9l0) fbkVar;
            int i = n9l0Var.f151819c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n9l0Var.f151819c = i - Integer.MIN_VALUE;
            } else {
                n9l0Var = new n9l0(r9l0Var, fbkVar);
            }
        } else {
            n9l0Var = new n9l0(r9l0Var, fbkVar);
        }
        Object objM83461h = n9l0Var.f151817a;
        int i2 = n9l0Var.f151819c;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM83461h);
            n9l0Var.f151819c = 1;
            if (((uml0) iml0Var).m83458e(false, n9l0Var) != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            bga.m29073P(objM83461h);
        } else {
            if (i2 == 2) {
                bga.m29073P(objM83461h);
                n9l0Var.f151819c = 3;
                objM83461h = ((uml0) iml0Var).m83461h(n9l0Var);
                if (objM83461h != obj) {
                    if (((Boolean) objM83461h).booleanValue()) {
                        n9l0Var.f151819c = 4;
                        objM83461h = r9l0Var.m75082h(n9l0Var);
                        if (objM83461h != obj) {
                            if (((Boolean) objM83461h).booleanValue()) {
                                n9l0Var.f151819c = 5;
                            }
                        }
                    }
                    r9l0Var.f197083t = qyg1.m74178H(false);
                    return w2a1.f247311a;
                }
                return obj;
            }
            if (i2 == 3) {
                bga.m29073P(objM83461h);
                if (((Boolean) objM83461h).booleanValue()) {
                    n9l0Var.f151819c = 4;
                    objM83461h = r9l0Var.m75082h(n9l0Var);
                    if (objM83461h != obj) {
                        if (((Boolean) objM83461h).booleanValue()) {
                            n9l0Var.f151819c = 5;
                        }
                    }
                    return obj;
                }
                r9l0Var.f197083t = qyg1.m74178H(false);
                return w2a1.f247311a;
            }
            if (i2 == 4) {
                bga.m29073P(objM83461h);
                if (((Boolean) objM83461h).booleanValue()) {
                    n9l0Var.f151819c = 5;
                }
                r9l0Var.f197083t = qyg1.m74178H(false);
                return w2a1.f247311a;
            }
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM83461h);
        }
        r9l0Var.f197079f.m75471a("trial-end: cleared stored trial end");
        r9l0Var.f197083t = qyg1.m74178H(false);
        return w2a1.f247311a;
        if (wj50.m88271j(r9l0Var.f197083t, qyg1.m74178H(true))) {
            fal0 fal0Var = r9l0Var.f197074a;
            n9l0Var.f151819c = 2;
            if (fal0Var.m41183c(n9l0Var) != obj) {
                n9l0Var.f151819c = 3;
                objM83461h = ((uml0) iml0Var).m83461h(n9l0Var);
                if (objM83461h != obj) {
                    if (((Boolean) objM83461h).booleanValue()) {
                        n9l0Var.f151819c = 4;
                        objM83461h = r9l0Var.m75082h(n9l0Var);
                        if (objM83461h != obj) {
                            if (((Boolean) objM83461h).booleanValue()) {
                                n9l0Var.f151819c = 5;
                            }
                        }
                    }
                    r9l0Var.f197083t = qyg1.m74178H(false);
                    return w2a1.f247311a;
                }
            }
        } else {
            n9l0Var.f151819c = 3;
            objM83461h = ((uml0) iml0Var).m83461h(n9l0Var);
            if (objM83461h != obj) {
                if (((Boolean) objM83461h).booleanValue()) {
                    n9l0Var.f151819c = 4;
                    objM83461h = r9l0Var.m75082h(n9l0Var);
                    if (objM83461h != obj) {
                        if (((Boolean) objM83461h).booleanValue()) {
                            n9l0Var.f151819c = 5;
                        }
                    }
                }
                r9l0Var.f197083t = qyg1.m74178H(false);
                return w2a1.f247311a;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e A[PHI: r1
      0x008e: PHI (r1v13 java.lang.Object) = (r1v11 java.lang.Object), (r1v1 java.lang.Object) binds: [B:37:0x008b, B:20:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: e */
    public static final Object m75080e(r9l0 r9l0Var, ibk ibkVar) {
        q9l0 q9l0Var;
        Object objM84972c;
        fal0 fal0Var = r9l0Var.f197074a;
        if (ibkVar instanceof q9l0) {
            q9l0Var = (q9l0) ibkVar;
            int i = q9l0Var.f186621c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q9l0Var.f186621c = i - Integer.MIN_VALUE;
            } else {
                q9l0Var = new q9l0(r9l0Var, ibkVar);
            }
        } else {
            q9l0Var = new q9l0(r9l0Var, ibkVar);
        }
        Object objM41182b = q9l0Var.f186619a;
        int i2 = q9l0Var.f186621c;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM41182b);
            q9l0Var.f186621c = 1;
            objM41182b = fal0Var.m41182b(q9l0Var);
            if (objM41182b != yukVar) {
            }
        }
        if (i2 == 1) {
            bga.m29073P(objM41182b);
        } else {
            if (i2 == 2) {
                bga.m29073P(objM41182b);
                objM84972c = ((s6x0) objM41182b).f206218a;
                if (objM84972c instanceof c6x0) {
                    objM84972c = null;
                }
                if (wj50.m88271j(objM84972c, qyg1.m74178H(true))) {
                    q9l0Var.f186621c = 3;
                    objM41182b = fal0Var.m41181a(q9l0Var);
                    if (objM41182b != yukVar) {
                        if (((Boolean) objM41182b).booleanValue()) {
                            q9l0Var.f186621c = 4;
                            if (fal0Var.m41190j(q9l0Var) != yukVar) {
                            }
                        }
                    }
                }
            }
            if (i2 == 3) {
                bga.m29073P(objM41182b);
                if (((Boolean) objM41182b).booleanValue()) {
                    q9l0Var.f186621c = 4;
                    if (fal0Var.m41190j(q9l0Var) != yukVar) {
                    }
                }
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM41182b);
                return w2a1Var;
            }
            bga.m29073P(objM41182b);
        }
        Completable completableIgnoreElement = ske.m78369c(r9l0Var.f197078e, "client:trigger:for:opt-in-trial", null, null, null, null, null, null, null, null, 510).ignoreElement();
        q9l0Var.f186621c = 5;
        return zn91.m96565n(completableIgnoreElement, q9l0Var) == yukVar ? yukVar : w2a1Var;
        if (((Boolean) objM41182b).booleanValue()) {
            v9l0 v9l0Var = r9l0Var.f197077d;
            q9l0Var.f186621c = 2;
            objM84972c = v9l0Var.m84972c(q9l0Var);
            if (objM84972c != yukVar) {
                if (objM84972c instanceof c6x0) {
                    objM84972c = null;
                }
                if (wj50.m88271j(objM84972c, qyg1.m74178H(true))) {
                    q9l0Var.f186621c = 3;
                    objM41182b = fal0Var.m41181a(q9l0Var);
                    if (objM41182b != yukVar) {
                        if (((Boolean) objM41182b).booleanValue()) {
                            q9l0Var.f186621c = 4;
                            if (fal0Var.m41190j(q9l0Var) != yukVar) {
                                Completable completableIgnoreElement2 = ske.m78369c(r9l0Var.f197078e, "client:trigger:for:opt-in-trial", null, null, null, null, null, null, null, null, 510).ignoreElement();
                                q9l0Var.f186621c = 5;
                                if (zn91.m96565n(completableIgnoreElement2, q9l0Var) == yukVar) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: c */
    public final void mo25302c() {
        nc4 nc4Var = ((uml0) this.f197076c).f231903b;
        if (nc4Var.m64111c() && nc4Var.m64112d()) {
            di41 di41Var = this.f197082i;
            if (di41Var == null || !di41Var.isActive()) {
                this.f197082i = x0h1.m89578u(this.f197080g, null, 0, new o9l0(this, null, 1), 3);
            }
        }
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: d */
    public final void mo25303d() {
        di41 di41Var = this.f197081h;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f197081h = null;
        di41 di41Var2 = this.f197082i;
        if (di41Var2 != null) {
            di41Var2.mo26601e(null);
        }
        this.f197082i = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (((p204p.uml0) r2).m83455b(r0) == r5) goto L28;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m75081f(ibk ibkVar) {
        l9l0 l9l0Var;
        if (ibkVar instanceof l9l0) {
            l9l0Var = (l9l0) ibkVar;
            int i = l9l0Var.f131146c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l9l0Var.f131146c = i - Integer.MIN_VALUE;
            } else {
                l9l0Var = new l9l0(this, ibkVar);
            }
        } else {
            l9l0Var = new l9l0(this, ibkVar);
        }
        Object objM83460g = l9l0Var.f131144a;
        int i2 = l9l0Var.f131146c;
        iml0 iml0Var = this.f197076c;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM83460g);
                l9l0Var.f131146c = 1;
                objM83460g = ((uml0) iml0Var).m83460g(l9l0Var);
                if (objM83460g == yukVar) {
                }
                return yukVar;
            }
            if (i2 == 1) {
                bga.m29073P(objM83460g);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM83460g);
            }
            return w2a1.f247311a;
            if (((Boolean) objM83460g).booleanValue()) {
                l9l0Var.f131146c = 2;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return w2a1.f247311a;
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: g */
    public final void mo25304g(ViewGroup viewGroup) {
        if (this.f197074a.m41189i()) {
            this.f197081h = x0h1.m89578u(this.f197080g, null, 0, new o9l0(this, null, 0), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d4, code lost:
    
        if (r0 == r11) goto L38;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m75082h(ibk ibkVar) {
        p9l0 p9l0Var;
        String str;
        if (ibkVar instanceof p9l0) {
            p9l0Var = (p9l0) ibkVar;
            int i = p9l0Var.f175269c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p9l0Var.f175269c = i - Integer.MIN_VALUE;
            } else {
                p9l0Var = new p9l0(this, ibkVar);
            }
        } else {
            p9l0Var = new p9l0(this, ibkVar);
        }
        Object objM96567o = p9l0Var.f175267a;
        int i2 = p9l0Var.f175269c;
        boolean z = false;
        rg91 rg91Var = this.f197079f;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                rg91Var.m75471a("trial-end: requesting message for trigger \"on-demand-trial:1-day-trial:end\"");
                Single singleM78369c = ske.m78369c(this.f197078e, "on-demand-trial:1-day-trial:end", null, null, null, null, null, null, null, null, 510);
                p9l0Var.f175269c = 1;
                objM96567o = zn91.m96567o(singleM78369c, p9l0Var);
                if (objM96567o == yukVar) {
                }
                return yukVar;
            }
            if (i2 == 1) {
                bga.m29073P(objM96567o);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            MessagePresentationStatus messagePresentationStatus = (MessagePresentationStatus) objM96567o;
            rg91Var.m75471a("trial-end: presentation → " + messagePresentationStatus);
            if ((messagePresentationStatus instanceof MessagePresentationStatus.Presented) || (messagePresentationStatus instanceof MessagePresentationStatus.Dismissed)) {
                z = true;
            }
            return qyg1.m74178H(z);
            MessageResponse messageResponse = (MessageResponse) objM96567o;
            if (messageResponse instanceof MessageResponse.Success) {
                str = "trial-end: response → Success(messageRequestId=" + ((MessageResponse.Success) messageResponse).getMessageRequestId() + ")";
            } else {
                if (!(messageResponse instanceof MessageResponse.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "trial-end: response → Failure(discardReason=" + ((MessageResponse.Failure) messageResponse).getDiscardReason() + ")";
            }
            rg91Var.m75471a(str);
            if (messageResponse instanceof MessageResponse.Success) {
                Single singleFirstOrError = this.f197078e.mo78373e().m71699b(((MessageResponse.Success) messageResponse).getMessageRequestId()).filter(wyx.f256377U0).firstOrError();
                p9l0Var.f175269c = 2;
                objM96567o = zn91.m96567o(singleFirstOrError, p9l0Var);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            rg91Var.m75471a(tfe.m80650h(e2, "trial-end: request threw "));
        }
        return qyg1.m74178H(z);
    }
}
