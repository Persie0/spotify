package p204p;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class akj0 extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    public final WebView f16551a;

    /* JADX INFO: renamed from: b */
    public final ioc1 f16552b;

    /* JADX INFO: renamed from: c */
    public final FrameLayout f16553c;

    /* JADX INFO: renamed from: d */
    public final View f16554d;

    /* JADX INFO: renamed from: e */
    public final rmm0 f16555e;

    /* JADX INFO: renamed from: f */
    public final boolean f16556f;

    /* JADX INFO: renamed from: g */
    public final boolean f16557g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f16558h;

    /* JADX INFO: renamed from: i */
    public final WebView f16559i;

    public akj0(WebView webView, ioc1 ioc1Var, FrameLayout frameLayout, View view, rmm0 rmm0Var, boolean z, boolean z2, mqk mqkVar, ArrayList arrayList) {
        this.f16551a = webView;
        this.f16552b = ioc1Var;
        this.f16553c = frameLayout;
        this.f16554d = view;
        this.f16555e = rmm0Var;
        this.f16556f = z;
        this.f16557g = z2;
        this.f16558h = arrayList;
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(mqkVar);
        this.f16559i = webView2;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        return defaultVideoPoster == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : defaultVideoPoster;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        ((WebView.WebViewTransport) message.obj).setWebView(this.f16559i);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        FrameLayout frameLayout = this.f16553c;
        frameLayout.removeAllViews();
        frameLayout.setVisibility(8);
        this.f16551a.setVisibility(0);
        if (this.f16557g) {
            this.f16554d.setVisibility(0);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        rmm0 rmm0Var;
        String[] resources = permissionRequest.getResources();
        ArrayList<String> arrayList = new ArrayList();
        for (String str : resources) {
            boolean zM88271j = wj50.m88271j(str, "android.webkit.resource.AUDIO_CAPTURE");
            boolean z = this.f16556f;
            if (!zM88271j && !wj50.m88271j(str, "android.webkit.resource.VIDEO_CAPTURE")) {
                z = false;
            }
            if (z) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : arrayList) {
            j6f.m52564V(wj50.m88271j(str2, "android.webkit.resource.AUDIO_CAPTURE") ? h6f.m46715L("android.permission.MODIFY_AUDIO_SETTINGS", "android.permission.RECORD_AUDIO") : wj50.m88271j(str2, "android.webkit.resource.VIDEO_CAPTURE") ? Collections.singletonList("android.permission.CAMERA") : lau.f131415a, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            rmm0Var = this.f16555e;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            if (!(lzj.m60353c((Context) ((eh00) rmm0Var.mo29880l().f119536b).invoke(), (String) next) == 0)) {
                arrayList3.add(next);
            }
        }
        String[] strArr = (String[]) arrayList3.toArray(new String[0]);
        if (!(strArr.length == 0)) {
            this.f16558h.add(new zjj0(this, arrayList, permissionRequest));
            rmm0Var.mo29880l().m55458H0((String[]) Arrays.copyOf(strArr, strArr.length));
        } else if (arrayList.isEmpty()) {
            permissionRequest.deny();
        } else {
            permissionRequest.grant((String[]) arrayList.toArray(new String[0]));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (this.f16557g) {
            this.f16554d.setVisibility(8);
        }
        this.f16551a.setVisibility(8);
        FrameLayout frameLayout = this.f16553c;
        frameLayout.setVisibility(0);
        frameLayout.addView(view);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        this.f16552b.invoke(new noa0(1, valueCallback, ValueCallback.class, "onReceiveValue", "onReceiveValue(Ljava/lang/Object;)V", 0, 0, 18));
        return true;
    }
}
