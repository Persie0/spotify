package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.concertcampaignview.p047v1.CtaType;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.Function;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.List;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public final class p4l0 implements jha, Function, t6l0, SingleTransformer, sc41, i5b1 {

    /* JADX INFO: renamed from: e */
    public static final byte[] f173975e = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, MessagePack.Code.FIXEXT2, MessagePack.Code.BIN16, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: f */
    public static final byte[] f173976f = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f173977a;

    /* JADX INFO: renamed from: b */
    public int f173978b;

    /* JADX INFO: renamed from: c */
    public int f173979c;

    /* JADX INFO: renamed from: d */
    public Object f173980d;

    public /* synthetic */ p4l0(int i, byte b) {
        this.f173977a = i;
    }

    /* JADX INFO: renamed from: u */
    public static void m69141u(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(bga.m29095q(i2));
    }

    @Override // io.reactivex.rxjava3.core.SingleTransformer
    /* JADX INFO: renamed from: V */
    public Single mo23389V(Single single) {
        return single.retryWhen(new fus0(this, 14));
    }

    @Override // p204p.jha
    /* JADX INFO: renamed from: a */
    public int mo53370a() {
        int i = this.f173978b;
        return i == -1 ? ((l2n0) this.f173980d).m57921I() : i;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        ae80 ae80Var = (ae80) this.f173980d;
        return vjf1.m85770t(dau.f47107a, new yd80(ae80Var, this.f173978b, this.f173979c, (Boolean) obj, null)).flatMap(new mj70(ae80Var, 3));
    }

    @Override // p204p.sc41
    /* JADX INFO: renamed from: c */
    public void mo57069c(Canvas canvas) {
        int iSave = canvas.save();
        tc41 tc41Var = (tc41) this.f173980d;
        tc41Var.getBounds();
        canvas.translate(this.f173978b - tc41Var.f219016i.left, 0 + tc41Var.f219018k);
        canvas.drawText(tc41Var.m80416a(), 0, 1, 0.0f, 0.0f, tc41Var.f219014g);
        canvas.restoreToCount(iSave);
    }

    @Override // p204p.i5b1
    /* JADX INFO: renamed from: e */
    public int mo49774e() {
        return this.f173978b;
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: f */
    public w05 mo35621f(long j, w05 w05Var, w05 w05Var2, w05 w05Var3) {
        return ((dc31) this.f173980d).mo35621f(j, w05Var, w05Var2, w05Var3);
    }

    @Override // p204p.jha
    /* JADX INFO: renamed from: g */
    public int mo53371g() {
        return this.f173978b;
    }

    @Override // p204p.sc41
    /* JADX INFO: renamed from: h */
    public int mo57071h() {
        return ((tc41) this.f173980d).f219016i.height();
    }

    @Override // p204p.jha
    /* JADX INFO: renamed from: i */
    public int mo53372i() {
        return this.f173979c;
    }

    @Override // p204p.sc41
    /* JADX INFO: renamed from: j */
    public int mo57072j() {
        Rect rect = ((tc41) this.f173980d).f219016i;
        return (rect.right - rect.left) + this.f173978b + this.f173979c;
    }

    @Override // p204p.i5b1
    /* JADX INFO: renamed from: k */
    public int mo49775k() {
        return this.f173979c;
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: m */
    public w05 mo35624m(long j, w05 w05Var, w05 w05Var2, w05 w05Var3) {
        return ((dc31) this.f173980d).mo35624m(j, w05Var, w05Var2, w05Var3);
    }

    /* JADX INFO: renamed from: n */
    public byte m69142n(int i, int i2) {
        return ((byte[][]) this.f173980d)[i2][i];
    }

    /* JADX INFO: renamed from: o */
    public int m69143o() {
        return this.f173979c;
    }

    /* JADX INFO: renamed from: p */
    public eh00 m69144p() {
        return (eh00) this.f173980d;
    }

    /* JADX INFO: renamed from: q */
    public int m69145q() {
        return this.f173978b;
    }

    /* JADX INFO: renamed from: r */
    public void m69146r(int i, int i2, int i3) {
        ((byte[][]) this.f173980d)[i2][i] = (byte) i3;
    }

    /* JADX INFO: renamed from: s */
    public void m69147s(int i, int i2, boolean z) {
        ((byte[][]) this.f173980d)[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: renamed from: t */
    public void m69148t(int i, int i2) {
        this.f173978b = i;
        this.f173979c = i2;
    }

    public String toString() {
        switch (this.f173977a) {
            case 2:
                int i = this.f173978b;
                int i2 = this.f173979c;
                StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr = ((byte[][]) this.f173980d)[i3];
                    for (int i4 = 0; i4 < i; i4++) {
                        byte b = bArr[i4];
                        if (b == 0) {
                            sb.append(" 0");
                        } else if (b != 1) {
                            sb.append("  ");
                        } else {
                            sb.append(" 1");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: v */
    public synchronized int m69149v() {
        int i = this.f173979c;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = ((Context) this.f173980d).getPackageManager();
        if (ffe1.m41527a((Context) this.f173980d).f247445a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        int i2 = 1;
        if (!u1h1.m82225t()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f173979c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f173979c = 2;
            return 2;
        }
        if (u1h1.m82225t()) {
            this.f173979c = 2;
            i2 = 2;
        } else {
            this.f173979c = 1;
        }
        return i2;
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        dx40 dx40VarMo51806g = swd1Var.f214650a.mo51806g(519);
        jkb0 jkb0Var = (jkb0) this.f173980d;
        TextView textView = jkb0Var.f113272c2;
        if (textView == null) {
            wj50.m88260d0("selectionTitle");
            throw null;
        }
        int i = this.f173978b;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i + dx40VarMo51806g.f53849b;
        textView.setLayoutParams(marginLayoutParams);
        Button button = jkb0Var.f113270a2;
        if (button == null) {
            wj50.m88260d0("continueButton");
            throw null;
        }
        int i2 = this.f173979c;
        ViewGroup.LayoutParams layoutParams2 = button.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.bottomMargin = i2 + dx40VarMo51806g.f53851d;
        button.setLayoutParams(marginLayoutParams2);
        return swd1.f214649b;
    }

    public /* synthetic */ p4l0(int i, int i2, Object obj, int i3) {
        this.f173977a = i3;
        this.f173978b = i;
        this.f173979c = i2;
        this.f173980d = obj;
    }

    public p4l0(Context context) {
        this.f173977a = 14;
        this.f173979c = 0;
        this.f173980d = context;
    }

    public /* synthetic */ p4l0(Object obj, int i, int i2, int i3) {
        this.f173977a = i3;
        this.f173980d = obj;
        this.f173978b = i;
        this.f173979c = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p4l0(int i) {
        this(i, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, n7x0.f151266i, 8);
        this.f173977a = 8;
    }

    public p4l0(int i, int i2) {
        this.f173977a = 2;
        this.f173980d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.f173978b = i;
        this.f173979c = i2;
    }

    public p4l0(tc41 tc41Var) {
        this.f173977a = 10;
        this.f173980d = tc41Var;
    }

    public p4l0(int i, int i2, bqs bqsVar) {
        this.f173977a = 13;
        this.f173978b = i;
        this.f173979c = i2;
        this.f173980d = new dc31(new biz(i, i2, bqsVar));
    }

    public p4l0(i4i0 i4i0Var, r300 r300Var) {
        this.f173977a = 1;
        l2n0 l2n0Var = i4i0Var.f98533e;
        this.f173980d = l2n0Var;
        l2n0Var.m57930R(12);
        int iM57921I = l2n0Var.m57921I();
        if ("audio/raw".equals(r300Var.f195387p)) {
            int iM46338z = h0b1.m46338z(r300Var.f195363M) * r300Var.f195360J;
            if (iM57921I % iM46338z != 0) {
                yif1.m93819w0("Audio sample size mismatch. stsd sample size: " + iM46338z + ", stsz sample size: " + iM57921I);
                iM57921I = iM46338z;
            }
        }
        this.f173978b = iM57921I == 0 ? -1 : iM57921I;
        this.f173979c = l2n0Var.m57921I();
    }
}
