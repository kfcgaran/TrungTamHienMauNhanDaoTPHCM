package fighting.teamlego.trungtamhienmaunhandaotphcm;


import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.BaseAdapter;
import android.widget.Toast;


public class WebView_BaiViet extends Fragment {

    WebView webView;

    public WebView_BaiViet() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_web_view__bai_viet, container, false);
        webView = view.findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        Bundle bundle = getArguments();
        String link = bundle.getString("LINK");
        webView.loadUrl(link);
        webView.setWebViewClient(new WebViewClient());
        return view;
    }

}
