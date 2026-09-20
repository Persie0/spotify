package p204p;

import android.view.View;
import androidx.compose.p002ui.platform.ComposeView;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.TooltipAnchorView;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class b481 implements qte0 {

    /* JADX INFO: renamed from: a */
    public final m500 f23248a;

    /* JADX INFO: renamed from: b */
    public final iwa f23249b;

    /* JADX INFO: renamed from: c */
    public final adl0 f23250c;

    /* JADX INFO: renamed from: d */
    public final kal0 f23251d;

    /* JADX INFO: renamed from: e */
    public final g7l0 f23252e;

    /* JADX INFO: renamed from: f */
    public final jal0 f23253f;

    /* JADX INFO: renamed from: g */
    public final i381 f23254g;

    /* JADX INFO: renamed from: h */
    public final e940 f23255h;

    /* JADX INFO: renamed from: i */
    public final kv91 f23256i;

    /* JADX INFO: renamed from: j */
    public final lt91 f23257j;

    /* JADX INFO: renamed from: k */
    public final r381 f23258k;

    /* JADX INFO: renamed from: l */
    public pqm0 f23259l;

    /* JADX INFO: renamed from: m */
    public final LinkedHashSet f23260m;

    /* JADX INFO: renamed from: n */
    public final zv41 f23261n;

    /* JADX INFO: renamed from: o */
    public final zv41 f23262o;

    public b481(m500 m500Var, cu5 cu5Var, iwa iwaVar, adl0 adl0Var, kal0 kal0Var, g7l0 g7l0Var, jal0 jal0Var, i381 i381Var, e940 e940Var, kv91 kv91Var, lt91 lt91Var, r381 r381Var) {
        this.f23248a = m500Var;
        this.f23249b = iwaVar;
        this.f23250c = adl0Var;
        this.f23251d = kal0Var;
        this.f23252e = g7l0Var;
        this.f23253f = jal0Var;
        this.f23254g = i381Var;
        this.f23255h = e940Var;
        this.f23256i = kv91Var;
        this.f23257j = lt91Var;
        this.f23258k = r381Var;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f23260m = linkedHashSet;
        Boolean bool = Boolean.FALSE;
        this.f23261n = jag1.m52819d(bool);
        this.f23262o = jag1.m52819d(bool);
        linkedHashSet.add(x0h1.m89578u(n5h1.m63737m(m500Var), null, 0, new v831(this, null, 27), 3));
    }

    /* JADX INFO: renamed from: c */
    public static final void m28075c(b481 b481Var, fyf fyfVar, fxh0 fxh0Var, String str, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1116656042);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(fyfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(b481Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = sam.m77645B(siv0.f209669e);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            c4t0 c4t0VarMo30068a = vm6.f242710a.mo30068a(b481Var.f23255h);
            wy41 wy41Var = pda0.f176396a;
            boolean zM91770i = xq00Var.m91770i(kqi0Var) | xq00Var.m91770i(b481Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                objM91750T2 = new e371(12, b481Var, kqi0Var);
                xq00Var.m91793t0(objM91750T2);
            }
            qqg1.m73533c(new c4t0[]{c4t0VarMo30068a, pda0.m69677c((eh00) objM91750T2, xq00Var)}, rkk.m75772x(1219339882, new x831(fxh0Var, str, kqi0Var, fyfVar, 3), xq00Var), xq00Var, 56);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ho41(b481Var, fyfVar, fxh0Var, str, i, 22);
        }
    }

    @Override // p204p.qte0
    /* JADX INFO: renamed from: a */
    public final void mo27112a(MessageResponseToken messageResponseToken, gh00 gh00Var) {
        this.f23259l = new pqm0(messageResponseToken, gh00Var.invoke(messageResponseToken));
    }

    @Override // p204p.qte0
    /* JADX INFO: renamed from: b */
    public final void mo27113b(eh00 eh00Var) {
        int i;
        b250 b250Var;
        pqm0 pqm0Var = this.f23259l;
        if (pqm0Var == null) {
            throw new IllegalStateException("Required value was null.");
        }
        MessageResponseToken messageResponseToken = (MessageResponseToken) pqm0Var.f180350a;
        Format.Tooltip tooltip = (Format.Tooltip) messageResponseToken.getMessageData().getFormat();
        TooltipAnchorView anchorView = tooltip.getAnchorView();
        if (!(anchorView instanceof TooltipAnchorView.Type)) {
            throw new NoWhenBranchMatchedException();
        }
        WeakReference weakReference = (WeakReference) this.f23249b.f106369a.get(((TooltipAnchorView.Type) anchorView).getType());
        View view = weakReference != null ? (View) weakReference.get() : null;
        m500 m500Var = this.f23248a;
        if (view == null) {
            v2a1 v2a1VarM63059p = mwh0.m63059p(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId());
            Message.CreativeMessage messageData = messageResponseToken.getMessageData();
            String simpleName = m500Var.getClass().getSimpleName();
            TooltipAnchorView anchorView2 = tooltip.getAnchorView();
            if (!(anchorView2 instanceof TooltipAnchorView.Type)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f23253f.m52842a(v2a1VarM63059p, messageData, new DiscardReason.NoTooltipAnchorViewFound(simpleName, ((TooltipAnchorView.Type) anchorView2).getType().name()));
            m28076d();
            return;
        }
        if (!view.isAttachedToWindow()) {
            View view2 = view;
            view2.addOnAttachStateChangeListener(new u381(view2, this, pqm0Var, tooltip, view2));
            return;
        }
        String requestId = messageResponseToken.getRequestId();
        igx0 igx0Var = new igx0();
        int i2 = t381.f216728a[tooltip.getTooltipDirection().ordinal()];
        if (i2 != 1) {
            i = 2;
            if (i2 != 2) {
                i = 3;
                if (i2 != 3) {
                    i = 4;
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        } else {
            i = 1;
        }
        igx0Var.f76366e = i;
        igx0Var.f76364c = new v381(pqm0Var, this);
        igx0Var.f76365d = new w381(pqm0Var, this);
        ComposeView composeView = new ComposeView(this.f23248a, null, 0, 6, null);
        composeView.setViewCompositionStrategy(mkr0.f144646T0);
        x150 x150Var = new x150(new oq1(composeView, 8));
        r250 r250Var = new r250(new lq91(this.f23257j, null, this.f23256i));
        b250 lbfVar = fau.f67640b;
        if (x150Var.equals(lbfVar) && r250Var.equals(lbfVar)) {
            b250Var = lbfVar;
        } else if (x150Var.equals(lbfVar)) {
            b250Var = r250Var;
        } else if (!r250Var.equals(lbfVar)) {
            b250Var = x150Var;
            lbfVar = new lbf(x150Var, r250Var);
            b250Var = lbfVar;
        }
        b250Var = x150Var;
        joc1.m53876c(composeView, b250Var);
        composeView.setContent(new fyf(new z381(pqm0Var, this), true, 629604074));
        igx0Var.f102079h = composeView;
        ((mcq) this.f23258k).m61471f(cu5.m33867l(m500Var, requestId, igx0Var), view, new ase0(xre0.f265332a, ure0.f233341a), (44 & 8) != 0 ? null : uv51.f234364b1, new x381(this, 2), (44 & 32) != 0 ? null : new a481(pqm0Var, this));
    }

    /* JADX INFO: renamed from: d */
    public final void m28076d() {
        ((mcq) this.f23258k).m61470e();
        Iterator it = this.f23260m.iterator();
        while (it.hasNext()) {
            ((tf60) it.next()).mo26601e(null);
        }
    }

    @Override // p204p.qte0
    public final void dismiss() {
        m28076d();
    }
}
