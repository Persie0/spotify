package p204p;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public class jp4 implements dk31 {

    /* JADX INFO: renamed from: e */
    public static final a7j0 f114559e = new a7j0(20);

    /* JADX INFO: renamed from: a */
    public final Class f114560a;

    /* JADX INFO: renamed from: b */
    public final Method f114561b;

    /* JADX INFO: renamed from: c */
    public final Method f114562c;

    /* JADX INFO: renamed from: d */
    public final Method f114563d;

    public jp4(Class cls) throws NoSuchMethodException {
        this.f114560a = cls;
        this.f114561b = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        cls.getMethod("setHostname", String.class);
        this.f114562c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f114563d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p204p.dk31
    /* JADX INFO: renamed from: a */
    public final boolean mo32685a(SSLSocket sSLSocket) {
        return this.f114560a.isInstance(sSLSocket);
    }

    @Override // p204p.dk31
    /* JADX INFO: renamed from: b */
    public final boolean mo32686b() {
        boolean z = hl4.f92609e;
        return q350.m72057l();
    }

    @Override // p204p.dk31
    /* JADX INFO: renamed from: c */
    public final String mo32687c(SSLSocket sSLSocket) {
        if (this.f114560a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f114562c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, vuc.f244913a);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !wj50.m88271j(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e2);
                }
            }
        }
        return null;
    }

    @Override // p204p.dk31
    /* JADX INFO: renamed from: d */
    public final void mo32688d(SSLSocket sSLSocket, String str, List list) {
        if (this.f114560a.isInstance(sSLSocket)) {
            try {
                this.f114561b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f114563d;
                wco0 wco0Var = wco0.f250081a;
                method.invoke(sSLSocket, tco0.m80478c(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
