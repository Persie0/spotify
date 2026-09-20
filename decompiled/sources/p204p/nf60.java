package p204p;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.spotify.appendix.contentviewstate.view.LoadingView;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class nf60 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153255a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f153256b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nf60(Context context, int i) {
        super(0);
        this.f153255a = i;
        this.f153256b = context;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f153255a;
        w2a1 w2a1Var = w2a1.f247311a;
        Context context = this.f153256b;
        switch (i) {
            case 0:
                return Integer.valueOf(context.getColor(R.color.jellyfish_default_bottom));
            case 1:
                return Integer.valueOf(context.getColor(R.color.jellyfish_default_mid));
            case 2:
                return Integer.valueOf(context.getColor(R.color.jellyfish_default_top));
            case 3:
                return context.getString(R.string.kallax_prompted_by);
            case 4:
                return lzj.m60387w(context, R.color.ended_event_badge_color_selector);
            case 5:
                return context.getResources().getString(R.string.live_event_badge_view_ended);
            case 6:
                return lzj.m60387w(context, R.color.live_event_badge_color_selector);
            case 7:
                return context.getResources().getString(R.string.live_event_badge_view_live);
            case 8:
                return lzj.m60387w(context, R.color.scheduled_event_badge_color_selector);
            case 9:
                return context.getResources().getString(R.string.live_event_badge_view_scheduled);
            case 10:
                LinearLayout linearLayout = new LinearLayout(context);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.loading_element_padding);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(17);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                og6 og6Var = LoadingView.f2973Q0;
                LoadingView loadingView = (LoadingView) layoutInflaterFrom.inflate(R.layout.loading_view, (ViewGroup) null);
                if (loadingView.f2974L0 == 1) {
                    loadingView.f2974L0 = 2;
                    loadingView.postDelayed(loadingView.f2975M0, 0);
                }
                linearLayout.addView(loadingView);
                return linearLayout;
            case 11:
                return Long.valueOf(context.getResources().getInteger(android.R.integer.config_shortAnimTime));
            case 12:
                Toast.makeText(context, "To be implemented", 0).show();
                return w2a1Var;
            case 13:
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                    if (packageInfo.signatures != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : packageInfo.signatures) {
                            int i2 = yd20.f271624a;
                            vme0 vme0Var = wd20.f250193a;
                            byte[] byteArray = signature.toByteArray();
                            vme0Var.getClass();
                            int length = byteArray.length;
                            c95.m31852r(0, length, byteArray.length);
                            c95.m31842h("expectedInputSize must be >= 0 but was %s", length, length >= 0);
                            c95 c95VarMo28837w = vme0Var.mo28837w();
                            c95VarMo28837w.mo25556S(byteArray, length);
                            arrayList.add(c95VarMo28837w.mo25555F().toString());
                        }
                        StringBuilder sb = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            while (true) {
                                sb.append((CharSequence) next);
                                if (it.hasNext()) {
                                    sb.append((CharSequence) ":");
                                    next = it.next();
                                }
                            }
                        }
                        return sb.toString();
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Logger.m3970f(e, "Failed to get the application signatures", new Object[0]);
                }
                return "";
            case 14:
                return Integer.valueOf(context.getColor(R.color.default_endless_background));
            case 15:
                return geg1.m44505l(context);
            case 16:
                return (ConnectivityManager) context.getSystemService("connectivity");
            case 17:
                Toast.makeText(context, R.string.parent_details_remove_parent_unavailable, 0).show();
                return w2a1Var;
            case 18:
                Drawable drawable = context.getDrawable(R.drawable.encore_selected_icon_indicator_dot);
                wj50.m88279p(drawable);
                drawable.setTintList(lzj.m60387w(context, R.color.encore_accent_color));
                return drawable;
            case 19:
                return context.getDrawable(R.drawable.seek_timestamp_background);
            case 20:
                return context.getDrawable(R.drawable.seek_timestamp_background_large);
            case 21:
                Drawable drawable2 = context.getDrawable(R.drawable.check_alt_circle_24);
                if (drawable2 == null) {
                    return null;
                }
                drawable2.mutate().setTintList(lzj.m60387w(context, R.color.encore_accessory));
                return drawable2;
            case 22:
                Drawable drawable3 = context.getDrawable(R.drawable.encore_icon_check_alt_fill);
                if (drawable3 == null) {
                    return null;
                }
                drawable3.mutate().setTintList(lzj.m60387w(context, R.color.encore_accessory_green));
                return drawable3;
            default:
                Drawable drawableM50639w = ihf1.m50639w(context, R.drawable.smartshuffle_progress_spinner);
                if (drawableM50639w != null) {
                    return drawableM50639w;
                }
                throw new IllegalStateException("Could not get drawable for loading");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf60(edi0 edi0Var, Context context) {
        super(0);
        this.f153255a = 13;
        this.f153256b = context;
    }
}
