package p204p;

import io.ably.lib.types.AblyException;
import io.ably.lib.types.ChannelOptions;
import io.ably.lib.types.ChannelProperties;
import io.ably.lib.types.DecodingContext;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.PresenceMessage;
import io.ably.lib.types.ProtocolMessage;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;

/* JADX INFO: loaded from: classes16.dex */
public abstract class bnc extends b5x {

    /* JADX INFO: renamed from: w */
    public static final ErrorInfo f28782w = new ErrorInfo("Channel not attached", 400, 90001);

    /* JADX INFO: renamed from: x */
    public static final String f28783x = mmc.class.getName();

    /* JADX INFO: renamed from: c */
    public final String f28784c;

    /* JADX INFO: renamed from: d */
    public final xyq0 f28785d;

    /* JADX INFO: renamed from: e */
    public znc f28786e;

    /* JADX INFO: renamed from: f */
    public ErrorInfo f28787f;

    /* JADX INFO: renamed from: i */
    public wmc f28790i;

    /* JADX INFO: renamed from: j */
    public ymc f28791j;

    /* JADX INFO: renamed from: k */
    public boolean f28792k;

    /* JADX INFO: renamed from: l */
    public Timer f28793l;

    /* JADX INFO: renamed from: m */
    public Timer f28794m;

    /* JADX INFO: renamed from: p */
    public final C2596y0 f28797p;

    /* JADX INFO: renamed from: q */
    public ChannelOptions f28798q;

    /* JADX INFO: renamed from: r */
    public Map f28799r;

    /* JADX INFO: renamed from: s */
    public String f28800s;

    /* JADX INFO: renamed from: t */
    public String f28801t;

    /* JADX INFO: renamed from: u */
    public boolean f28802u;

    /* JADX INFO: renamed from: v */
    public final DecodingContext f28803v;

    /* JADX INFO: renamed from: g */
    public final ChannelProperties f28788g = new ChannelProperties();

    /* JADX INFO: renamed from: h */
    public int f28789h = 0;

    /* JADX INFO: renamed from: n */
    public final anc f28795n = new anc();

    /* JADX INFO: renamed from: o */
    public final HashMap f28796o = new HashMap();

    public bnc(C2596y0 c2596y0, String str, ChannelOptions channelOptions) {
        tx8.m81897l(f28783x, "RealtimeChannel(); channel = " + str);
        this.f28797p = c2596y0;
        this.f28784c = str;
        th30.m80824d(str);
        this.f28798q = channelOptions;
        znc zncVar = this.f28786e;
        if ((zncVar == znc.attached || zncVar == znc.attaching) && (channelOptions.hasModes() || channelOptions.hasParams())) {
            m29942e(true, null);
        }
        this.f28785d = new xyq0((mmc) this);
        this.f28792k = false;
        this.f28786e = znc.initialized;
        this.f28803v = new DecodingContext();
    }

    /* JADX INFO: renamed from: h */
    public static void m29940h(uuf uufVar, ErrorInfo errorInfo) {
        if (uufVar != null) {
            try {
                uufVar.onError(errorInfo);
            } catch (Throwable th) {
                tx8.m81890e(f28783x, "Unexpected exception calling CompletionListener", th);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m29941i(uuf uufVar) {
        if (uufVar != null) {
            try {
                uufVar.onSuccess();
            } catch (Throwable th) {
                tx8.m81890e(f28783x, "Unexpected exception calling CompletionListener", th);
            }
        }
    }

    @Override // p204p.b5x
    /* JADX INFO: renamed from: a */
    public final void mo28213a(Object obj, Object obj2, Object[] objArr) {
        xmc xmcVar = (xmc) obj;
        try {
            aoc aocVar = (aoc) objArr[0];
            uuf uufVar = xmcVar.f263334a;
            bnc bncVar = xmcVar.f263336c;
            if (aocVar.f17641a.equals(xmcVar.f263335b)) {
                bncVar.m28215c(xmcVar);
                uufVar.onSuccess();
            } else if (aocVar.f17641a.equals(znc.failed)) {
                bncVar.m28215c(xmcVar);
                uufVar.onError(bncVar.f28787f);
            }
        } catch (Throwable th) {
            tx8.m81890e(f28783x, "Unexpected exception calling ChannelStateListener", th);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m29942e(boolean z, uuf uufVar) {
        m29945j();
        m29944g(z, uufVar);
    }

    /* JADX INFO: renamed from: f */
    public final void m29943f(boolean z, rmc rmcVar) throws AblyException {
        StringBuilder sb = new StringBuilder("attach(); channel = ");
        String str = this.f28784c;
        sb.append(str);
        String string = sb.toString();
        String str2 = f28783x;
        tx8.m81897l(str2, string);
        znc zncVar = znc.attached;
        if (!z) {
            int iOrdinal = this.f28786e.ordinal();
            if (iOrdinal == 1) {
                m28216d(new xmc(this, rmcVar, zncVar));
                return;
            } else if (iOrdinal == 2) {
                m29941i(rmcVar);
                return;
            } else if (iOrdinal == 3) {
                this.f28790i = new wmc(z, rmcVar);
                return;
            }
        }
        vyi vyiVar = this.f28797p.f267827i.f224711g;
        syi syiVar = vyiVar.f246136n;
        if (!syiVar.f215255c && !syiVar.f215256d) {
            ErrorInfo errorInfo = vyiVar.f246137o;
            if (errorInfo == null) {
                errorInfo = syiVar.f215254b;
            }
            throw AblyException.fromErrorInfo(errorInfo);
        }
        tx8.m81897l(str2, "attach(); channel = " + str + "; sending ATTACH request");
        ProtocolMessage protocolMessage = new ProtocolMessage(ProtocolMessage.Action.attach, str);
        ChannelOptions channelOptions = this.f28798q;
        if (channelOptions != null) {
            if (channelOptions.hasParams()) {
                Map<String, String> map = this.f28798q.params;
                HashMap map2 = new HashMap(map.size());
                map2.putAll(map);
                protocolMessage.params = map2;
            }
            if (this.f28798q.hasModes()) {
                protocolMessage.setFlags(this.f28798q.getModeFlags());
            }
        }
        protocolMessage.channelSerial = this.f28788g.channelSerial;
        if (this.f28802u) {
            tx8.m81897l(str2, "attach(); message decode recovery in progress, setting last message channelserial");
            protocolMessage.channelSerial = this.f28801t;
        }
        m28216d(new xmc(this, rmcVar, zncVar));
        if (this.f28792k) {
            protocolMessage.setFlag(ProtocolMessage.Flag.attach_resume);
        }
        m29954s(znc.attaching, null);
        vyiVar.m86798r(protocolMessage, true, null);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m29944g(boolean z, uuf uufVar) {
        try {
            Timer timer = new Timer();
            this.f28793l = timer;
            try {
                m29943f(z, new rmc(0, this, uufVar));
            } catch (AblyException e) {
                this.f28793l = null;
                m29940h(uufVar, e.errorInfo);
            }
            Timer timer2 = this.f28793l;
            if (timer2 == null) {
                return;
            }
            smc smcVar = new smc(this, timer, 0);
            String[] strArr = ejq.f60272a;
            timer2.schedule(smcVar, 10000L);
        } catch (Throwable th) {
            m29940h(uufVar, ErrorInfo.fromThrowable(th));
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m29945j() {
        Timer[] timerArr = {this.f28793l, this.f28794m};
        this.f28794m = null;
        this.f28793l = null;
        for (int i = 0; i < 2; i++) {
            Timer timer = timerArr[i];
            if (timer != null) {
                timer.cancel();
                timer.purge();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m29946k(uuf uufVar) {
        m29945j();
        synchronized (this) {
            znc zncVar = this.f28786e;
            try {
                Timer timer = new Timer();
                this.f28793l = timer;
                try {
                    m29947l(new rmc(1, this, uufVar));
                } catch (AblyException unused) {
                    this.f28793l = null;
                }
                Timer timer2 = this.f28793l;
                if (timer2 == null) {
                    return;
                }
                tmc tmcVar = new tmc(this, timer, uufVar, zncVar);
                String[] strArr = ejq.f60272a;
                timer2.schedule(tmcVar, 10000L);
            } catch (Throwable th) {
                m29940h(uufVar, ErrorInfo.fromThrowable(th));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m29947l(rmc rmcVar) throws AblyException {
        tx8.m81897l(f28783x, "detach(); channel = " + this.f28784c);
        int iOrdinal = this.f28786e.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                this.f28791j = new ymc(rmcVar);
                return;
            }
            if (iOrdinal == 3) {
                if (rmcVar != null) {
                    m28216d(new xmc(this, rmcVar, znc.detached));
                    return;
                }
                return;
            } else if (iOrdinal != 4) {
                vyi vyiVar = this.f28797p.f267827i.f224711g;
                syi syiVar = vyiVar.f246136n;
                if (syiVar.f215255c || syiVar.f215256d) {
                    m29950o(rmcVar);
                    return;
                }
                ErrorInfo errorInfo = vyiVar.f246137o;
                if (errorInfo == null) {
                    errorInfo = syiVar.f215254b;
                }
                throw AblyException.fromErrorInfo(errorInfo);
            }
        }
        m29941i(rmcVar);
    }

    /* JADX INFO: renamed from: m */
    public final void m29948m(ErrorInfo errorInfo) {
        if (this.f28786e == znc.attached) {
            m28214b(new Object[]{new aoc(errorInfo)}, cnc.f39948h);
        }
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m29949n() {
        try {
            Timer timer = new Timer();
            this.f28794m = timer;
            int i = this.f28789h + 1;
            this.f28789h = i;
            this.f28794m.schedule(new smc(this, timer, 1), tx8.m81893h(i, this.f28797p.f7157a.channelRetryTimeout));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m29950o(uuf uufVar) {
        ProtocolMessage protocolMessage = new ProtocolMessage(ProtocolMessage.Action.detach, this.f28784c);
        if (uufVar != null) {
            m28216d(new xmc(this, uufVar, znc.detached));
        }
        this.f28792k = false;
        m29953r(znc.detaching, null);
        this.f28797p.f267827i.f224711g.m86798r(protocolMessage, true, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m29951p(ErrorInfo errorInfo) {
        m29945j();
        tx8.m81897l(f28783x, "setDetached(); channel = " + this.f28784c);
        this.f28785d.m92428f(errorInfo);
        m29953r(znc.detached, errorInfo);
    }

    /* JADX INFO: renamed from: q */
    public final void m29952q(ErrorInfo errorInfo) {
        m29945j();
        tx8.m81897l(f28783x, "setFailed(); channel = " + this.f28784c);
        this.f28785d.m92428f(errorInfo);
        this.f28792k = false;
        m29954s(znc.failed, errorInfo);
    }

    /* JADX INFO: renamed from: r */
    public final void m29953r(znc zncVar, ErrorInfo errorInfo) {
        m29954s(zncVar, errorInfo);
    }

    /* JADX INFO: renamed from: s */
    public final void m29954s(znc zncVar, ErrorInfo errorInfo) {
        aoc aocVar;
        String str = f28783x;
        tx8.m81897l(str, "setState(): channel = " + this.f28784c + "; setting " + zncVar);
        synchronized (this) {
            aocVar = new aoc(zncVar, errorInfo);
            this.f28786e = zncVar;
            this.f28787f = errorInfo;
        }
        if (zncVar != znc.attaching && zncVar != znc.suspended) {
            this.f28789h = 0;
        }
        znc zncVar2 = znc.detached;
        if (zncVar == zncVar2 || zncVar == znc.suspended || zncVar == znc.failed) {
            this.f28788g.channelSerial = null;
        }
        m28214b(new Object[]{aocVar}, zncVar.f284462a);
        if (zncVar == zncVar2 && this.f28790i != null) {
            tx8.m81897l(str, "Pending attach request after detach- now reattaching channel:" + this.f28784c);
            wmc wmcVar = this.f28790i;
            m29942e(wmcVar.f252774a, wmcVar.f252775b);
            this.f28790i = null;
            return;
        }
        if (zncVar != znc.attached || this.f28791j == null) {
            return;
        }
        tx8.m81897l(str, "Pending detach request after attach. Now detaching channel:" + this.f28784c);
        try {
            m29946k((uuf) this.f28791j.f274218a);
            this.f28791j = null;
        } catch (AblyException e) {
            tx8.m81890e(f28783x, "Channel failed to detach after attach:" + this.f28784c, e);
        }
    }

    /* JADX INFO: renamed from: t */
    public final synchronized void m29955t(ErrorInfo errorInfo) {
        try {
            m29945j();
            znc zncVar = this.f28786e;
            if (zncVar == znc.attached || zncVar == znc.attaching) {
                tx8.m81897l(f28783x, "setSuspended(); channel = " + this.f28784c);
                xyq0 xyq0Var = this.f28785d;
                synchronized (xyq0Var.f267402d) {
                    xyq0Var.f267402d.notifyAll();
                }
                xyq0Var.m92426d(errorInfo);
                m29954s(znc.suspended, errorInfo);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: u */
    public final synchronized void m29956u(List list) {
        this.f28786e = znc.attaching;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qyi qyiVar = (qyi) it.next();
                PresenceMessage[] presenceMessageArr = qyiVar.f193906a.presence;
                if (presenceMessageArr != null && presenceMessageArr.length > 0) {
                    for (PresenceMessage presenceMessage : presenceMessageArr) {
                        xyq0 xyq0Var = this.f28785d;
                        uuf uufVar = qyiVar.f193907b;
                        synchronized (xyq0Var.f267404f) {
                            xyq0Var.f267401c.add(new wyq0(presenceMessage, uufVar));
                        }
                    }
                }
            }
        }
    }
}
