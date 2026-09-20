package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes.dex */
public final class dju {

    /* JADX INFO: renamed from: a */
    public final e940 f49743a;

    /* JADX INFO: renamed from: b */
    public final Context f49744b;

    public dju(e940 e940Var, Context context) {
        this.f49743a = e940Var;
        this.f49744b = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public Object m36234a(Uri uri, ibk ibkVar) {
        i940 i940Var;
        if (ibkVar instanceof i940) {
            i940Var = (i940) ibkVar;
            int i = i940Var.f99907d;
            if ((i & Integer.MIN_VALUE) != 0) {
                i940Var.f99907d = i - Integer.MIN_VALUE;
            } else {
                i940Var = new i940(this, ibkVar);
            }
        } else {
            i940Var = new i940(this, ibkVar);
        }
        Object objM48221p = i940Var.f99905b;
        int i2 = i940Var.f99907d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM48221p);
                if (wj50.m88271j(uri, Uri.EMPTY)) {
                    return new ixk(uri, m36235b());
                }
                i940Var.f99904a = uri;
                i940Var.f99907d = 1;
                hqb hqbVar = new hqb(1, seg1.m77914f(i940Var));
                hqbVar.m48222q();
                lxe lxeVarMo24613j = this.f49743a.mo24613j(uri.toString());
                lxeVarMo24613j.m60176b();
                lxeVarMo24613j.f137801g = false;
                Resources resources = this.f49744b.getResources();
                lxeVarMo24613j.m60190p(resources.getDimensionPixelSize(R.dimen.max_media_session_image_dimension), resources.getDimensionPixelSize(R.dimen.max_media_session_image_dimension), 2);
                lxeVarMo24613j.m60179e();
                lxeVarMo24613j.m60191q("MediaSession_AlbumArtTarget");
                lxeVarMo24613j.m60184j(new u010(hqbVar, uri, this, 18));
                hqbVar.mo42415l(new zc30(lxeVarMo24613j, 10));
                objM48221p = hqbVar.m48221p();
                yuk yukVar = yuk.f276404a;
                if (objM48221p == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uri = i940Var.f99904a;
                bga.m29073P(objM48221p);
            }
            return (ixk) objM48221p;
        } catch (Exception unused) {
            return new ixk(uri, m36235b());
        }
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m36235b() {
        Context context = this.f49744b;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.max_media_session_image_dimension);
        Drawable drawableM50639w = ihf1.m50639w(context, R.drawable.encore_icon_album);
        if (drawableM50639w != null) {
            svg1.m79458L(drawableM50639w, context.getResources().getColor(R.color.dark_base_text_subdued));
        }
        if (drawableM50639w == null) {
            return null;
        }
        if ((drawableM50639w instanceof BitmapDrawable) && ((BitmapDrawable) drawableM50639w).getBitmap() == null) {
            return null;
        }
        return xtm0.m92066M(drawableM50639w, dimensionPixelSize, dimensionPixelSize, null);
    }

    /* JADX INFO: renamed from: c */
    public void m36236c(Uri uri) {
        if (uri.equals(Uri.EMPTY)) {
            return;
        }
        lxe lxeVarMo24606b = this.f49743a.mo24606b(uri);
        Resources resources = this.f49744b.getResources();
        lxeVarMo24606b.m60190p(resources.getDimensionPixelSize(R.dimen.max_media_session_image_dimension), resources.getDimensionPixelSize(R.dimen.max_media_session_image_dimension), 2);
        lxeVarMo24606b.m60179e();
        lxeVarMo24606b.m60188n();
    }

    public dju(Context context, e940 e940Var) {
        this.f49744b = context;
        this.f49743a = e940Var;
    }
}
