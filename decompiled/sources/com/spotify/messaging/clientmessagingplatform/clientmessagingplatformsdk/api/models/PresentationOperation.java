package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.adl0;
import p204p.kal0;
import p204p.qte0;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/PresentationOperation;", "", "<init>", "()V", "Present", "Dismiss", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/PresentationOperation$Dismiss;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/PresentationOperation$Present;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class PresentationOperation {
    public static final int $stable = 0;

    @Metadata(m24211d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/PresentationOperation$Dismiss;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/PresentationOperation;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;", "dismissReason", "Lp/kal0;", "onDismissedCallback", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;Lp/kal0;)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;", "component2", "()Lp/kal0;", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;Lp/kal0;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/PresentationOperation$Dismiss;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissReason;", "getDismissReason", "Lp/kal0;", "getOnDismissedCallback", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Dismiss extends PresentationOperation {
        public static final int $stable = 8;
        private final DismissReason dismissReason;
        private final kal0 onDismissedCallback;

        public Dismiss(DismissReason dismissReason, kal0 kal0Var) {
            super(null);
            this.dismissReason = dismissReason;
            this.onDismissedCallback = kal0Var;
        }

        public static /* synthetic */ Dismiss copy$default(Dismiss dismiss, DismissReason dismissReason, kal0 kal0Var, int i, Object obj) {
            if ((i & 1) != 0) {
                dismissReason = dismiss.dismissReason;
            }
            if ((i & 2) != 0) {
                kal0Var = dismiss.onDismissedCallback;
            }
            return dismiss.copy(dismissReason, kal0Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DismissReason getDismissReason() {
            return this.dismissReason;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final kal0 getOnDismissedCallback() {
            return this.onDismissedCallback;
        }

        public final Dismiss copy(DismissReason dismissReason, kal0 onDismissedCallback) {
            return new Dismiss(dismissReason, onDismissedCallback);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dismiss)) {
                return false;
            }
            Dismiss dismiss = (Dismiss) other;
            return wj50.m88271j(this.dismissReason, dismiss.dismissReason) && wj50.m88271j(this.onDismissedCallback, dismiss.onDismissedCallback);
        }

        public final DismissReason getDismissReason() {
            return this.dismissReason;
        }

        public final kal0 getOnDismissedCallback() {
            return this.onDismissedCallback;
        }

        public int hashCode() {
            return this.onDismissedCallback.hashCode() + (this.dismissReason.hashCode() * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    @Metadata(m24211d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/PresentationOperation$Present;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/PresentationOperation;", "Lp/qte0;", "presenter", "Lp/adl0;", "onPresentedCallback", "<init>", "(Lp/qte0;Lp/adl0;)V", "component1", "()Lp/qte0;", "component2", "()Lp/adl0;", "copy", "(Lp/qte0;Lp/adl0;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/PresentationOperation$Present;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp/qte0;", "getPresenter", "Lp/adl0;", "getOnPresentedCallback", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Present extends PresentationOperation {
        public static final int $stable = 0;
        private final adl0 onPresentedCallback;
        private final qte0 presenter;

        public Present(qte0 qte0Var, adl0 adl0Var) {
            super(null);
            this.presenter = qte0Var;
            this.onPresentedCallback = adl0Var;
        }

        public static /* synthetic */ Present copy$default(Present present, qte0 qte0Var, adl0 adl0Var, int i, Object obj) {
            if ((i & 1) != 0) {
                qte0Var = present.presenter;
            }
            if ((i & 2) != 0) {
                adl0Var = present.onPresentedCallback;
            }
            return present.copy(qte0Var, adl0Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final qte0 getPresenter() {
            return this.presenter;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final adl0 getOnPresentedCallback() {
            return this.onPresentedCallback;
        }

        public final Present copy(qte0 presenter, adl0 onPresentedCallback) {
            return new Present(presenter, onPresentedCallback);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Present)) {
                return false;
            }
            Present present = (Present) other;
            return wj50.m88271j(this.presenter, present.presenter) && wj50.m88271j(this.onPresentedCallback, present.onPresentedCallback);
        }

        public final adl0 getOnPresentedCallback() {
            return this.onPresentedCallback;
        }

        public final qte0 getPresenter() {
            return this.presenter;
        }

        public int hashCode() {
            return this.onPresentedCallback.hashCode() + (this.presenter.hashCode() * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    public /* synthetic */ PresentationOperation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PresentationOperation() {
    }
}
