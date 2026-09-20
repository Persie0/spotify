package p204p;

import android.content.Context;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ClientMessage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Pacing;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.PacingTimeUnit;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.ButtonIconAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.ButtonStyle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.ButtonType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.ClickAction;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Icon;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.BottomSheetTemplate;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapCompletable;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class w83 {

    /* JADX INFO: renamed from: a */
    public final Context f248829a;

    /* JADX INFO: renamed from: b */
    public final ske f248830b;

    /* JADX INFO: renamed from: c */
    public final cxe f248831c;

    /* JADX INFO: renamed from: d */
    public final dg10 f248832d;

    /* JADX INFO: renamed from: e */
    public final xqb f248833e;

    /* JADX INFO: renamed from: f */
    public final q831 f248834f;

    /* JADX INFO: renamed from: g */
    public final xuk f248835g;

    public w83(Context context, ske skeVar, cxe cxeVar, dg10 dg10Var, xqb xqbVar, q831 q831Var, xuk xukVar) {
        this.f248829a = context;
        this.f248830b = skeVar;
        this.f248831c = cxeVar;
        this.f248832d = dg10Var;
        this.f248833e = xqbVar;
        this.f248834f = q831Var;
        this.f248835g = xukVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0161  */
    /* JADX WARN: Code duplicated, block: B:36:0x016b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0181  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final Object m87435a(w83 w83Var, vn80 vn80Var, int i, ibk ibkVar) {
        v83 v83Var;
        vn80 vn80Var2;
        int i2;
        MessagePresentationStatus messagePresentationStatus;
        DismissReason dismissReason;
        Button button;
        int i3 = i;
        xqb xqbVar = w83Var.f248833e;
        if (ibkVar instanceof v83) {
            v83Var = (v83) ibkVar;
            int i4 = v83Var.f238363e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                v83Var.f238363e = i4 - Integer.MIN_VALUE;
            } else {
                v83Var = new v83(w83Var, ibkVar);
            }
        } else {
            v83Var = new v83(w83Var, ibkVar);
        }
        v83 v83Var2 = v83Var;
        Object objM96567o = v83Var2.f238361c;
        int i5 = v83Var2.f238363e;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i5 != 0) {
            if (i5 == 1) {
                i3 = v83Var2.f238360b;
                vn80Var2 = v83Var2.f238359a;
                bga.m29073P(objM96567o);
            } else {
                if (i5 != 2) {
                    if (i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM96567o);
                    return w2a1Var;
                }
                i2 = v83Var2.f238360b;
                vn80Var2 = v83Var2.f238359a;
                bga.m29073P(objM96567o);
            }
            messagePresentationStatus = (MessagePresentationStatus) objM96567o;
            if (messagePresentationStatus instanceof MessagePresentationStatus.Dismissed) {
                dismissReason = ((MessagePresentationStatus.Dismissed) messagePresentationStatus).getDismissReason();
                if (dismissReason instanceof DismissReason.MessageButtonTapped) {
                    xqbVar.m91830j();
                    w83Var.f248834f.m72305j(t0j.m79824e(R.string.alexa_cmp_link_later).m52392q());
                    return w2a1Var;
                }
                button = ((DismissReason.MessageButtonTapped) dismissReason).getButton();
                v83Var2.f238359a = null;
                v83Var2.f238360b = i2;
                v83Var2.f238363e = 3;
                if (w83Var.m87436b(button, vn80Var2, v83Var2) == obj) {
                    return obj;
                }
            }
            return w2a1Var;
        }
        bga.m29073P(objM96567o);
        xqbVar.m91837q(i3);
        String string = UUID.randomUUID().toString();
        Context context = w83Var.f248829a;
        String string2 = context.getString(R.string.alexa_cmp_nudge_title);
        String string3 = context.getString(R.string.alexa_cmp_nudge_body);
        int i6 = 96;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        EncoreFont encoreFont = null;
        ButtonIconAlignment buttonIconAlignment = null;
        Button button2 = new Button("linkAccount", new ButtonStyle(context.getString(R.string.alexa_cmp_link_button), str, (String) null, (Icon) null, ButtonType.PRIMARY, encoreFont, buttonIconAlignment, i6, defaultConstructorMarker), new ClickAction("DISMISS", str, (Map) (0 == true ? 1 : 0), 4, (DefaultConstructorMarker) null));
        String string4 = context.getString(R.string.alexa_cmp_later_button);
        ButtonType buttonType = ButtonType.TERTIARY;
        Single singleM78369c = ske.m78369c(w83Var.f248830b, "spotify:alexa-account-linking:v1", null, null, geg1.m44518y(new ClientMessage("ALEXA_CMP_ACCOUNT_LINKING", string, new Format.BottomSheet(new BottomSheetTemplate.RichBottomSheet(null, "https://partner-account-linking-cdn.spotifycdn.com/alexa-link-128.png", string2, string3, button2, new Button("dismissCta", new ButtonStyle(string4, str, (String) (0 == true ? 1 : 0), (Icon) null, buttonType, encoreFont, buttonIconAlignment, i6, defaultConstructorMarker), new ClickAction("DISMISS", str, (Map) (0 == true ? 1 : 0), 4, (DefaultConstructorMarker) null)))), gbu.f78413a, new Pacing(0, PacingTimeUnit.HOURS))), null, null, null, null, null, 502);
        vn80Var2 = vn80Var;
        v83Var2.f238359a = vn80Var2;
        v83Var2.f238360b = i3;
        v83Var2.f238363e = 1;
        objM96567o = zn91.m96567o(singleM78369c, v83Var2);
        if (objM96567o != obj) {
        }
        return obj;
        int i7 = i3;
        MessageResponse messageResponse = (MessageResponse) objM96567o;
        if (messageResponse instanceof MessageResponse.Success) {
            r1a r1aVarM27776L = b0g1.m27776L(k0e1.m54985d(w83Var.f248830b.mo78373e().m71699b(((MessageResponse.Success) messageResponse).getMessageRequestId())), new C1977ig(new nlv0(), w83Var, vn80Var2, i7, (fbk) null));
            C2559x4 c2559x4 = new C2559x4(5);
            v83Var2.f238359a = vn80Var2;
            v83Var2.f238360b = i7;
            v83Var2.f238363e = 2;
            objM96567o = vyf1.m86758w(r1aVarM27776L, c2559x4, v83Var2);
            if (objM96567o != obj) {
                i2 = i7;
                messagePresentationStatus = (MessagePresentationStatus) objM96567o;
                if (messagePresentationStatus instanceof MessagePresentationStatus.Dismissed) {
                    dismissReason = ((MessagePresentationStatus.Dismissed) messagePresentationStatus).getDismissReason();
                    if (dismissReason instanceof DismissReason.MessageButtonTapped) {
                        xqbVar.m91830j();
                        w83Var.f248834f.m72305j(t0j.m79824e(R.string.alexa_cmp_link_later).m52392q());
                        return w2a1Var;
                    }
                    button = ((DismissReason.MessageButtonTapped) dismissReason).getButton();
                    v83Var2.f238359a = null;
                    v83Var2.f238360b = i2;
                    v83Var2.f238363e = 3;
                    if (w83Var.m87436b(button, vn80Var2, v83Var2) == obj) {
                    }
                }
            }
            return obj;
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m87436b(Button button, vn80 vn80Var, ibk ibkVar) {
        u83 u83Var;
        if (ibkVar instanceof u83) {
            u83Var = (u83) ibkVar;
            int i = u83Var.f227799d;
            if ((i & Integer.MIN_VALUE) != 0) {
                u83Var.f227799d = i - Integer.MIN_VALUE;
            } else {
                u83Var = new u83(this, ibkVar);
            }
        } else {
            u83Var = new u83(this, ibkVar);
        }
        Object obj = u83Var.f227797b;
        int i2 = u83Var.f227799d;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                String identifier = button.getIdentifier();
                boolean zM88271j = wj50.m88271j(identifier, "linkAccount");
                xqb xqbVar = this.f248833e;
                if (zM88271j) {
                    MaybeFlatMapCompletable maybeFlatMapCompletableM34312x = this.f248831c.m34312x(vn80Var, 1, xqbVar.m91831k());
                    u83Var.f227796a = vn80Var;
                    u83Var.f227799d = 1;
                    Object objM96565n = zn91.m96565n(maybeFlatMapCompletableM34312x, u83Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM96565n == yukVar) {
                        return yukVar;
                    }
                } else if (wj50.m88271j(identifier, "dismissCta")) {
                    xqbVar.m91830j();
                    this.f248834f.m72305j(t0j.m79824e(R.string.alexa_cmp_link_later).m52392q());
                }
                return w2a1.f247311a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vn80Var = u83Var.f227796a;
            bga.m29073P(obj);
            m87438d();
        } catch (Throwable unused) {
            m87437c(vn80Var);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: c */
    public final void m87437c(vn80 vn80Var) {
        j4u j4uVarM79824e = t0j.m79824e(R.string.alexa_cmp_error_body);
        j4uVarM79824e.m52390o(this.f248829a.getString(R.string.alexa_cmp_relink_button));
        j4uVarM79824e.m52399x(new ViewOnClickListenerC1708bk(6, this, vn80Var));
        this.f248834f.m72307m(j4uVarM79824e.m52392q());
    }

    /* JADX INFO: renamed from: d */
    public final void m87438d() {
        j4u j4uVarM79824e = t0j.m79824e(R.string.alexa_cmp_set_default_body);
        j4uVarM79824e.m52390o(this.f248829a.getString(R.string.alexa_cmp_set_default_button));
        j4uVarM79824e.m52399x(new y10(this, 3));
        this.f248834f.m72307m(j4uVarM79824e.m52392q());
    }
}
