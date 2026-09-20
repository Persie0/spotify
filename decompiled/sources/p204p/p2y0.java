package p204p;

import android.content.Context;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.CappingRule;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ClientMessage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
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
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class p2y0 {

    /* JADX INFO: renamed from: a */
    public final ske f173468a;

    /* JADX INFO: renamed from: b */
    public final er70 f173469b;

    /* JADX INFO: renamed from: c */
    public final er70 f173470c;

    /* JADX INFO: renamed from: d */
    public final r55 f173471d;

    /* JADX INFO: renamed from: e */
    public final z9j0 f173472e;

    /* JADX INFO: renamed from: f */
    public final d2j0 f173473f;

    /* JADX INFO: renamed from: g */
    public final q831 f173474g;

    /* JADX INFO: renamed from: h */
    public final Context f173475h;

    /* JADX INFO: renamed from: i */
    public final luk f173476i;

    public p2y0(ske skeVar, er70 er70Var, er70 er70Var2, r55 r55Var, z9j0 z9j0Var, d2j0 d2j0Var, q831 q831Var, Context context, luk lukVar) {
        this.f173468a = skeVar;
        this.f173469b = er70Var;
        this.f173470c = er70Var2;
        this.f173471d = r55Var;
        this.f173472e = z9j0Var;
        this.f173473f = d2j0Var;
        this.f173474g = q831Var;
        this.f173475h = context;
        this.f173476i = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0191  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final Object m68972a(f3y0 f3y0Var, ibk ibkVar) throws Throwable {
        o2y0 o2y0Var;
        vn80 vn80Var;
        String str;
        f3y0 f3y0Var2;
        vn80 vn80Var2;
        f3y0 f3y0Var3;
        MessagePresentationStatus messagePresentationStatus;
        Object objM89557A;
        if (ibkVar instanceof o2y0) {
            o2y0Var = (o2y0) ibkVar;
            int i = o2y0Var.f161179e;
            if ((i & Integer.MIN_VALUE) != 0) {
                o2y0Var.f161179e = i - Integer.MIN_VALUE;
            } else {
                o2y0Var = new o2y0(this, ibkVar);
            }
        } else {
            o2y0Var = new o2y0(this, ibkVar);
        }
        o2y0 o2y0Var2 = o2y0Var;
        Object objM96567o = o2y0Var2.f161177c;
        int i2 = o2y0Var2.f161179e;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                vn80Var = o2y0Var2.f161176b;
                f3y0 f3y0Var4 = o2y0Var2.f161175a;
                bga.m29073P(objM96567o);
                f3y0Var2 = f3y0Var4;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM96567o);
                    return w2a1Var;
                }
                vn80 vn80Var3 = o2y0Var2.f161176b;
                f3y0 f3y0Var5 = o2y0Var2.f161175a;
                bga.m29073P(objM96567o);
                f3y0Var3 = f3y0Var5;
                vn80Var2 = vn80Var3;
            }
            messagePresentationStatus = (MessagePresentationStatus) objM96567o;
            if (messagePresentationStatus != null && (messagePresentationStatus instanceof MessagePresentationStatus.Dismissed)) {
                o2y0Var2.f161175a = null;
                o2y0Var2.f161176b = null;
                o2y0Var2.f161179e = 3;
                objM89557A = x0h1.m89557A(this.f173476i, new m2y0((MessagePresentationStatus.Dismissed) messagePresentationStatus, this, vn80Var2, f3y0Var3, null), o2y0Var2);
                if (objM89557A != yukVar) {
                    objM89557A = w2a1Var;
                }
                if (objM89557A == yukVar) {
                    return yukVar;
                }
            }
            return w2a1Var;
        }
        bga.m29073P(objM96567o);
        vn80Var = new vn80(UUID.randomUUID().toString());
        int iOrdinal = f3y0Var.ordinal();
        if (iOrdinal == 0) {
            str = "samsung-account-linking-dialog";
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "samsung-account-linking-nudge";
        }
        String str2 = str;
        String string = UUID.randomUUID().toString();
        Context context = this.f173475h;
        String string2 = context.getString(R.string.samsung_cmp_title);
        String string3 = context.getString(R.string.samsung_cmp_body);
        String str3 = null;
        Button button = new Button("link_account", new ButtonStyle(context.getString(R.string.samsung_cmp_activate), str3, (String) null, (Icon) null, ButtonType.PRIMARY, (EncoreFont) null, (ButtonIconAlignment) null, 96, (DefaultConstructorMarker) null), new ClickAction("DISMISS", str3, (Map) (0 == true ? 1 : 0), 4, (DefaultConstructorMarker) null));
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Single singleM78369c = ske.m78369c(this.f173468a, "spotify:samsung-account-linking:v1", null, null, Collections.singletonList(new ClientMessage(str2, string, new Format.BottomSheet(new BottomSheetTemplate.RichBottomSheet(null, null, string2, string3, button, new Button("not_now", new ButtonStyle(context.getString(R.string.samsung_cmp_not_now), (String) objArr4, (String) objArr2, (Icon) objArr3, ButtonType.TERTIARY, (EncoreFont) objArr, (ButtonIconAlignment) null, 96, (DefaultConstructorMarker) null), new ClickAction("DISMISS", (String) (0 == true ? 1 : 0), (Map) objArr5, 4, (DefaultConstructorMarker) null)))), Collections.singleton(new CappingRule.Impression(3)), new Pacing(8, PacingTimeUnit.DAYS))), null, null, null, ConflictResolutionStrategy.DISCARD_SELF, null, 374);
        o2y0Var2.f161175a = f3y0Var;
        o2y0Var2.f161176b = vn80Var;
        o2y0Var2.f161179e = 1;
        objM96567o = zn91.m96567o(singleM78369c, o2y0Var2);
        if (objM96567o != yukVar) {
            f3y0Var2 = f3y0Var;
        }
        return yukVar;
        vn80 vn80Var4 = vn80Var;
        MessageResponse messageResponse = (MessageResponse) objM96567o;
        if (messageResponse instanceof MessageResponse.Success) {
            int i3 = 8;
            r1a r1aVar = new r1a(k0e1.m54985d(this.f173468a.mo78373e().m71699b(((MessageResponse.Success) messageResponse).getMessageRequestId())), new gjw0(i3, new nlv0(), this, vn80Var4, f3y0Var2, (fbk) null), 8);
            f6n0 f6n0Var = new f6n0(2, 22, null);
            o2y0Var2.f161175a = f3y0Var2;
            o2y0Var2.f161176b = vn80Var4;
            o2y0Var2.f161179e = 2;
            objM96567o = vyf1.m86758w(r1aVar, f6n0Var, o2y0Var2);
            if (objM96567o != yukVar) {
                vn80Var2 = vn80Var4;
                f3y0Var3 = f3y0Var2;
                messagePresentationStatus = (MessagePresentationStatus) objM96567o;
                if (messagePresentationStatus != null) {
                    o2y0Var2.f161175a = null;
                    o2y0Var2.f161176b = null;
                    o2y0Var2.f161179e = 3;
                    objM89557A = x0h1.m89557A(this.f173476i, new m2y0((MessagePresentationStatus.Dismissed) messagePresentationStatus, this, vn80Var2, f3y0Var3, null), o2y0Var2);
                    if (objM89557A != yukVar) {
                        objM89557A = w2a1Var;
                    }
                    if (objM89557A == yukVar) {
                    }
                }
            }
            return yukVar;
        }
        return w2a1Var;
    }
}
