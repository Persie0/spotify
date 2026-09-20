package p204p;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.spotify.music.R;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ncy0 {

    /* JADX INFO: renamed from: a */
    public final Activity f152610a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f152611b;

    /* JADX INFO: renamed from: c */
    public final FrameLayout f152612c;

    /* JADX INFO: renamed from: d */
    public final ProgressDialog f152613d;

    /* JADX INFO: renamed from: e */
    public final zu0 f152614e;

    public ncy0(Activity activity, ViewGroup viewGroup, LayoutInflater layoutInflater, boolean z, zu0 zu0Var) {
        this.f152610a = activity;
        this.f152614e = zu0Var;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.activity_scannable, viewGroup, false);
        this.f152611b = viewGroup2;
        this.f152612c = (FrameLayout) viewGroup2.findViewById(R.id.camera_preview);
        zu0Var.f286304g = new WeakReference(this);
        CompositeDisposable compositeDisposable = (CompositeDisposable) zu0Var.f286297Z;
        compositeDisposable.mo23393b((Disposable) zu0Var.f286296Y);
        compositeDisposable.mo23393b((Disposable) zu0Var.f286295X);
        this.f152613d = new ProgressDialog(activity);
        ImageButton imageButton = (ImageButton) viewGroup2.findViewById(R.id.scannable_cancel);
        tc41 tc41Var = new tc41(activity, vc41.X, activity.getResources().getDimensionPixelSize(R.dimen.actionbar_search_drawables_size));
        tc41Var.m80417b(activity.getColor(R.color.white));
        imageButton.setImageDrawable(tc41Var);
        final int i = 0;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: p.mcy0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ncy0 f142268b;

            {
                this.f142268b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        Activity activity2 = this.f142268b.f152610a;
                        activity2.setResult(0);
                        activity2.finish();
                        break;
                    default:
                        ncy0 ncy0Var = (ncy0) ((WeakReference) this.f142268b.f152614e.f286304g).get();
                        if (ncy0Var != null) {
                            Intent intent = new Intent("android.intent.action.GET_CONTENT");
                            intent.setType("image/*");
                            ncy0Var.f152610a.startActivityForResult(intent, 4567);
                            break;
                        }
                        break;
                }
            }
        });
        Button button = (Button) viewGroup2.findViewById(R.id.scannable_select_from_photos);
        final int i2 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: p.mcy0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ncy0 f142268b;

            {
                this.f142268b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        Activity activity2 = this.f142268b.f152610a;
                        activity2.setResult(0);
                        activity2.finish();
                        break;
                    default:
                        ncy0 ncy0Var = (ncy0) ((WeakReference) this.f142268b.f152614e.f286304g).get();
                        if (ncy0Var != null) {
                            Intent intent = new Intent("android.intent.action.GET_CONTENT");
                            intent.setType("image/*");
                            ncy0Var.f152610a.startActivityForResult(intent, 4567);
                            break;
                        }
                        break;
                }
            }
        });
        if (z) {
            button.setVisibility(8);
            ((TextView) viewGroup2.findViewById(R.id.social_listening_privacy_notice)).setVisibility(0);
            ((TextView) viewGroup2.findViewById(R.id.txt_scannable_instructions)).setText(R.string.scannables_social_listening_viewfinder_hint);
        }
    }
}
